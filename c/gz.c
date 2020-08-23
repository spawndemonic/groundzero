#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char * ITOA(int num){
  char * crvt=(char *)malloc(5);
  snprintf(crvt,5,"%d",num);
return crvt;
}

char * message(char*key,int num)
{
  char * msg = (char *)malloc(1024);
  printf("%s %d",key,num);
  strcat(msg,key);
  strcat(msg,ITOA(num));
  return msg;
}


int main (void){

  return 0;
}
