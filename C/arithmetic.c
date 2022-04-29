#include<stdio.h>
int main()
{
    int a, b, sum, sub, mul, mod;
    printf("Enter values of a and b:\n");
    scanf("%d%d", &a, &b);
    sum=a+b;
    sub=a-b;
    mul=a*b;
    mod=a%b;
    printf("The sum, subtraction, multiplication and modulas of a and b is %d, %d, %d and %d respectively", sum, sub, mul, mod);
    return 0;
}