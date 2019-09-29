import threading,sys,os,time,colorama,sys,select
from colorama import Fore,Style

def background():
  while True:
    time.sleep(3)
    print ('disarm me by typing quit')

#threading1 = threading.Thread(target=background)
#threading1.daemon=True
#threading1.start()

def sysnselect(prompt, timeout):
  sys.stdout.write(prompt)
  sys.stdout.flush()
  ready,_, _ = select.select([sys.stdin], [],[], timeout)
  if ready:
    return sys.stdin.readline().rstrip('\n')
  raise TimeoutExpired

def mainloop():
  #if len(sys.argv)>1:
   # print(sys.argv[0])
  test = 'this is a test'
  print(Fore.WHITE+Style.NORMAL,test)
#  while True:
#  if raw_input().lower()=='quit':
#    sys.exit()
#    else:
#      print'not disarmed'
  result = sysnselect('Enter: ',5)
  print(result)
mainloop()

