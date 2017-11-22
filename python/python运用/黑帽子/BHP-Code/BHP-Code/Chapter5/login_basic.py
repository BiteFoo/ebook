#-*-coding:utf-8-*-
import urllib2
import urllib
import cookielib
import threading
import sys

from HTMLParser import HTMLParser  

#general settings

#targer specific settings
target_url   = "http://10.10.10.129/dvwa/login.php"     #登录页面
target_post  = "http://10.10.10.129/dvwa/login.php"     #要提交的页面的 url

'''
登录页面关键字段:
<label for="user">Username</label> <input type="text" class="loginInput" size="20" name="username"><br />	
<label for="pass">Password</label> <input type="password" class="loginInput" AUTOCOMPLETE="off" size="20" name="password"><br />			
<p class="submit"><input type="submit" value="Login" name="Login"></p>
'''

username = "admin"     #真实的登录名
passwd   = "admin"

username_field = "username"     #通过查看源代码知道 用户名输入框对应的 name
password_field = "password"       #通过查看源代码知道 密码输入框对应的   passwd

success_check = "Training Courses"   #这是登录成功返回页面所拥有的值，以此来判断登录是否成功，可以通过改变上面的 username\passwd 来判断

class Parser(HTMLParser):       #注意继承的类
    def __init__(self):
        HTMLParser.__init__(self)
        self.tag_results = {}   #定义空字典

    # 主要作用，找到登录页面中包含 name value 的标签，全部放入一个字典中   {'username': 'username', 'Login': 'Login', 'password': 'password'}
    def handle_starttag(self, tag, attrs):    #相当于虚函数重写了 
        if tag == "input":
            tag_name  = None
            tag_value = None
            for name, value in attrs:
                if name == "name":
                    tag_name  = value
                if name == "value":
                    tag_value = value

            if tag_name is not None:
                self.tag_results[tag_name] = value

        

class Login(object):
    def __init__(self, username, passwd):
        self.username   = username
        self.passwd     = passwd
        self.found      = False

        print "Finished setting up for: %s %s" % (username, passwd)
    
    def login(self):
        print "begin login."
        jar      = cookielib.FileCookieJar("cookies")
        opener   = urllib2.build_opener(urllib2.HTTPCookieProcessor(jar))
        response = opener.open(target_url)
        #print "response: ",response      # response的值很奇怪 <addinfourl at 48053664 whose fp = <socket._fileobject object at 0x02DCEB30>>
                                          # 所以只有 read() 之后才是解析的页面
        
        page     = response.read()    # read() 之后才能解析
        #print page
        
        parser   = Parser()
        parser.feed(page)
        post_tags = parser.tag_results
        print post_tags      # 这是解析登录页面返回的字典 {'username': 'username', 'Login': 'Login', 'password': 'password'}

        post_tags[username_field] = self.username
        post_tags[password_field] = self.passwd
        
        login_data = urllib.urlencode(post_tags)
        print login_data    # 编码之后为 username=admin&Login=Login&password=admin 
        
        login_response = opener.open(target_post, login_data)

        login_result   = login_response.read()
        #print u"登入返回页面:" + login_result  这已经是登录进入的第一个页面的源码了

        if success_check in login_result:
            self.found = True

            print u"[*] 恭喜你登录成功."
            print "[*] Username: %s" % username
            print "[*] Password: %s" % passwd

login = Login(username, passwd)
login.login()


'''
登录成功之后返回:
HTTP/1.1 302 Found
Date: Wed, 21 Oct 2015 07:10:16 GMT
Server: Apache/2.2.14 (Ubuntu) mod_mono/2.4.3 PHP/5.3.2-1ubuntu4.5 with Suhosin-Patch mod_python/3.3.1 Python/2.6.5 mod_perl/2.0.4 Perl/v5.10.1
X-Powered-By: PHP/5.3.2-1ubuntu4.5
Expires: Thu, 19 Nov 1981 08:52:00 GMT
Cache-Control: no-store, no-cache, must-revalidate, post-check=0, pre-check=0
Pragma: no-cache
Location: traincourse.html        #这条是登录成功的标志
Vary: Accept-Encoding
Content-Length: 0
Content-Type: text/html

登录失败之后返回:
HTTP/1.1 302 Found
Date: Wed, 21 Oct 2015 07:12:23 GMT
Server: Apache/2.2.14 (Ubuntu) mod_mono/2.4.3 PHP/5.3.2-1ubuntu4.5 with Suhosin-Patch mod_python/3.3.1 Python/2.6.5 mod_perl/2.0.4 Perl/v5.10.1
X-Powered-By: PHP/5.3.2-1ubuntu4.5
Expires: Thu, 19 Nov 1981 08:52:00 GMT
Cache-Control: no-store, no-cache, must-revalidate, post-check=0, pre-check=0
Pragma: no-cache
Location: login.php               #这条是登录失败的标志
Vary: Accept-Encoding
Content-Length: 0
Content-Type: text/html
'''
