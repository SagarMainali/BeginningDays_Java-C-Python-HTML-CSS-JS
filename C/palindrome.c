#include <stdio.h>
int main()
{
    int rem, rev = 0, num, n;
    printf("Enter a number to check if it is palindrome: \n");
    scanf("%d", &n);
    num = n;
    while (n > 0)
    {
        rem = n % 10;
        rev = rev * 10 + rem;
        n = n / 10;
    }
    if (rev == num)
        printf("%d is a palindrome number", num);
    else
        printf("%d is not a plaindrome number", num);
    return 0;
}