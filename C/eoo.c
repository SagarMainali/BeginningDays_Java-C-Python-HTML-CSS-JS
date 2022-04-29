#include <stdio.h>
int main()
{
    printf("Enter the number to check if it is even or odd\n");
    int a;
    scanf("%d", &a);
    if (a % 2 == 0)
        printf("%d is an even number\n", a);
    else
        printf("%d is an odd number", a);
    return 0;
}