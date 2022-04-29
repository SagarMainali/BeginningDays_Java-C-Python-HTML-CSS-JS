//simple array program to store and display array elements from user
#include <stdio.h>
int main()
{
    int a;
    printf("Enter how many numbers you want to store :\n");
    scanf("%d", &a);
    int arr[a], i;
    printf("Enter any %d numbers :\n", a);
    for (i = 0; i < a; i++)
    {
        scanf("%d", &arr[i]);
    }
    printf("The numbers are stored as: \n");
    for (i = 0; i < a; i++)
    {
        printf("arr[%d] = %d\n", i, arr[i]);
    }
    return 0;
}