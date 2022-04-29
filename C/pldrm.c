#include <stdio.h>
int main()
{
    printf("Enter a number to check if it is palindrome or not\n");
    int n;
    scanf("%d", &n);
    int num = n, rev = 0, rem;
    while (n > 0)
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }
    if (rev == num)
        printf("Palindrome");
    else
        printf("Not Palindrome");
    return 0;
}
