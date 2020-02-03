#include<stdio.h>
#include<stdlib.h>
#include<sys/socket.h>
#include<string.h>
#include<netinet/in.h>
#include<arpa/inet.h>
#include "tools.h"
#define PORT 7890

char * ItoA(int val){
    char * str;
    itoa(val,str,10);
    return str;
}

int main(void){
  int socketfd;
  struct sockaddr_in server_addr;
  server_addr.sin_family = AF_INET;
  server_addr.sin_port = htons(PORT);
  server_addr.sin_addr.s_addr = inet_addr("127.0.0.1");
  socklen_t addr_size;
  char buffer[1024];
  char * key = "UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ";
  char * temp;

  if((socketfd = socket(AF_INET,SOCK_STREAM,0))==-1)
    fatal("In Socket");
  if((connect(socketfd, (struct sockaddr *) &server_addr,sizeof(server_addr)))==-1)
    fatal("Connection");
  while(1){
    for(int i=0;i<10000;i++){
      strcpy(temp,key);
      strcat(temp,ItoA(i));
     //send(int socket, const void *buffer, size_t length, int flags)
     send(socketfd,temp,sizeof(temp),0);

     //recv(int socket, void *buffer, size_t length, int flags) 
     recv(socketfd, &buffer, 1024,0);
    }
  recv(socketfd,buffer,1024,0);
  printf("%s\n",buffer);
  }
  close(socketfd);
}
