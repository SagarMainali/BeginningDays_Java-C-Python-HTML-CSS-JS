//program to print factorial of a number given by user
/*#include <stdio.h>
int main()
{
    printf("Please enter a number to print its factorial:");
    int num, facto = 1, i;
    scanf("%d", &num);
    for (i = 0; num > i; num--)
    {
        facto = facto * num;
    }
    printf("%d", facto);
    return 0;
}

*/

#include <stdio.h>
void factorial(int);
void main()
{
    printf("Please enter a number to print its factorial:");
    int num;
    scanf("%d", &num);
    factorial(num);
}

void factorial(int n)
{
    int i, facto = 1;
    for (i = 0; n > i; n--)
    {
        facto = facto * n;
    }
    printf("%d", facto);
}
