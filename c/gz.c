#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char * ITOA(int num){
  char * crvt;
gcvt(num,4,crvt);
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
 char * key = (char *)malloc(strlen("UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ")+1);
 key = "UoMYTrfrBFHyQXmg6gzctqAwOmw1IohZ";
 char * tmp;
 gcvt(1000,5,tmp);
 printf("%s",tmp);
  //for(int i =1000;i<1005;i++){
  //printf("%s",ITOA(i));
  //}
  return 0;
}
