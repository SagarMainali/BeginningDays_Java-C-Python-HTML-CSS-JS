//sum of n natural numbers
#include<stdio.h>
int main()
{
    printf("enter a number\n");
    int n, sum=0;
    scanf("%d",&n);
    for(int i=n; i!=0; i--)
    {
        sum=sum+i;
    }
    printf("%d",sum);
}