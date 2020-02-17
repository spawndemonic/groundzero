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
  char buff[50];
  char * key = "UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ";
    char * tmp= ITOA(1000);
  strcat(buff,key);
  strcat(buff,tmp);
  printf("%s",buff);
  //for(int i =1000;i<1005;i++){
  //printf("%s",ITOA(i));
  //}
  return 0;
}
