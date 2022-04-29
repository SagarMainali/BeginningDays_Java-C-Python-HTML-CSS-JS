#include <stdio.h>
#include <math.h>
int main()
{
    printf("Enter a number to check if it is armstrong or not\n");
    int n, rem, orig_num, count = 0, num;
    int sum=0;
    scanf("%d", &n);
    orig_num=n;
    num=n;
    while (n > 0)
    {
        n = n / 10;
        count++;
    }
    while (num > 0)
    {
        rem = num % 10;
        sum = sum + pow(rem, count);
        num = num / 10;
    }
    if (sum == orig_num)
        printf("%d is an Armstrong number", orig_num);
    else
        printf("%d is not an armstrong number", orig_num);
    return 0;
}
