#include<stdio.h>
int main()
{
 int a;
  scanf("%d",&a);
  int f=a/100;
  int t=a%10;
  int s=f+t;
  printf("%d",s);
  
  return 0;
}