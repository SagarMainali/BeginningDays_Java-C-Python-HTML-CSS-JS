//using recursion print digit of number
#include <stdio.h>
int main()
{
    int num;
    printf("Enter a number:\n");
    scanf("%d", &num);
    getDig(num);
    return 0;
}
int getDig(int n)
{
    if (n > 0)
        printf("%d\n", n % 10);
    getDig(n / 10);
}