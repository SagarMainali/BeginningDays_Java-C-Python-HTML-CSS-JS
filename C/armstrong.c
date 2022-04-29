#include <stdio.h>
#include <math.h>
int main()
{
    int n, num, org_num, count = 0, rem;
    double sum = 0;
    printf("Enter a number to check if is is armstrong:\n");
    scanf("%d", &n);
    num = n;
    org_num = n;
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
    if (sum == org_num)
        printf("Armstrong number");
    else
        printf("Not Armstrong number");
        return 0;
}