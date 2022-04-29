#include <stdio.h>
int main()
{
    printf("Enter how many numbers you want to enter: \n");
    int s, temp, i;
    scanf("%d", &s);
    int a[s];
    printf("Enter any %d numbers:\n", s);
    for (i = 0; i < s; i++)
    {
        scanf("\n%d", &a[i]);
    }
    for (i = 1; i < s; i++)
    {
        if(a[0]<a[i])
        {
            a[0] = a[i];
        }
    }
    printf("\n%d is the greatest number among them.", a[0]);
    return 0;
}