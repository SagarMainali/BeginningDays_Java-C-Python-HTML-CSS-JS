#include <stdio.h>
int sum()
{
    int a=2,b=6,c;
    c=a+b;
    return c;
}
int main()
{
    
    int add=sum();
    printf("The sum is %d.", add);
    return 0;
}