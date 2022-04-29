#include <stdio.h>
int main()
{
    printf("These are the prime numbers less than 100:\n");
    int a, b, temp;
    for (a = 2; a < 100; a++)
    {
        temp = 0;
        for (b = 2; b <= a / 2; b++)
        {
            if (a % b == 0)
                temp = 1;
        }

        if (temp == 0)
            printf("%d \n", a);
    }
}