#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <arpa/inet.h>
#include "tools.h"

#define PORT 7890

int main(void){
  struct sockaddr_in host_addr, client_addr;
  socklen_t sin_size;
  int recv_length=1, yes=1;
  char buffer[1024];
  int socketfd, clientfd;

  host_addr.sin_family = AF_INET;//assigning IPV4 address family
  host_addr.sin_port = htons(PORT);//convert port number to netowork short
  host_addr.sin_addr.s_addr = 0;//automatically assign IP
  memset(&(host_addr.sin_zero), '\0', 8);

  if((socketfd = socket(AF_INET,SOCK_STREAM,0))==-1)
    fatal("In Socket");

  if(bind(socketfd, (struct sockaddr *)&host_addr, sizeof(struct sockaddr))==-1)
     fatal("binding to socket");
  if (listen(socketfd, 5) == -1)
    fatal("listening on socket");

  while(1){
    sin_size = sizeof(struct sockaddr_in);
    clientfd = accept(socketfd, (struct sockaddr *)&client_addr, &sin_size);
    if(clientfd == -1)
      fatal("accepting connection");
    printf("server: got connection from %s prot %d\n",
        inet_ntoa(client_addr.sin_addr), ntohs(client_addr.sin_port));
    send(clientfd, "Hello, world!\n",13,0);
    while(recv_length > 0){
      printf("RECV: %d bytes\n", recv_length);
      dump(buffer, recv_length);
      recv_length = recv(clientfd, &buffer, 1024, 0);
    }
    shutdown(clientfd,2);
    close(clientfd);

  }
  return 0;
}
