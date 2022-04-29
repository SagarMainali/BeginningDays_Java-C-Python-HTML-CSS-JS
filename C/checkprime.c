#include <stdio.h>
int main()
{
    int a, temp = 0;
    printf("Enter a number to check if it is prime or not: \n");
    scanf("%d", &a);
    for (int b = 2; b <= a / 2; b++)
    {
        if (a % b == 0)
            temp = 1;
    }
    if (temp == 0)
        printf("%d is a Prime number.\n", a);
    else
        printf("%d is not a Prime number.\n", a);
    return 0;
}
