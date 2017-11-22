#-*-coding:utf-8-*-
'''
we can download any open source web application and locally determine its file and directory structure,we can create a purpose-built scanner that can hunt for
all files that are reachable on the remote target.This can root out leftover installation files,direcotries that should be protected by .htaccess files,and
other goodies that can assist an attacker in getting a toehold on the web server.
如果其他人用了开源的系统Wordpress,而你也有同样有一份，那么你们就有相同或者相似的路径，通过遍历自己系统中的路径，加上URL，URL+路径，就可以遍历的下载全站的所有东西咯，包括
那些不可见的东西
'''
#-*-coding:utf-8-*-
import Queue
import threading
import os
import urllib2

threads   = 10 

target    = "http://www.test.com"
directory = "/Users/justin/Downloads/joomla-3.1.1"
filters   = [".jpg",".gif","png",".css"]             # 如果目录中包含这些东西，我们是不需要下载下来的，因为没什么用其实

os.chdir(directory)

web_paths = Queue.Queue() 

for r,d,f in os.walk("."):                            # 将所有的路径都放入 web_paths 中
    for files in f:
        remote_path = "%s/%s" % (r,files)
        if remote_path.startswith("."):
            remote_path = remote_path[1:]
        if os.path.splitext(files)[1] not in filters:
            web_paths.put(remote_path)                 # 将路径放入到 web_paths 中

def test_remote():                                     # 10个线程在这里一直运行
    while not web_paths.empty():                       # 当web的路径不为空的时候，循环
        path = web_paths.get()                          
        url = "%s%s" % (target, path)

        request = urllib2.Request(url)                 # 通过路径来下载

        try:
            response = urllib2.urlopen(request)
            content  = response.read()

            print "[%d] => %s" % (response.code,path)       #输出

            response.close()
        
        except urllib2.HTTPError as error: 
            #print "Failed %s" % error.code
            pass
        
for i in range(threads):                            #开10个线程
    print "Spawning thread: %d" % i
    t = threading.Thread(target=test_remote)
    t.start()
