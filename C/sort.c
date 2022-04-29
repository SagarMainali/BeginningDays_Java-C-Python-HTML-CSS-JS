/* this is a program which asks array elements from the user and displays them. And sort them either
 in ascending or descending order, upon pressing 'A' or 'D'. */

#include <stdio.h>
int main()
{
    int size;
    printf("\nEnter the size of array: ");
    scanf("%d", &size);

    printf("\nEnter any %d elements :\n", size);
    int arr[size], i;
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    printf("\nThe elements you entered are stored as: ");
    for (i = 0; i < size; i++)
    {
        printf("\narr[%d] = %d", i, arr[i]);
    }

    int temp, j;
    for (i = 0; i < size; i++)
    {
        for (j = 1 + i; j < size; j++)
        {
            if (arr[i] > arr[j])
            {
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
    
    int a;
    printf("\n\nHow do you want to sort these array elements?\nEnter '0' for ascending or '1' for Descending:");
    scanf("%d", &a);

    if (a == 0)
    {
        printf("\nHere are the elements in ascending order :");
        for (i = 0; i < size; i++)
        {
            printf("\narr[%d] = %d", i, arr[i]);
        }
    }

    if (a == 1)
    {
        printf("\nHere are the elements in descending order :");
        for (i = size - 1; 0 <= i; i--)
        {
            printf("\narr[%d] = %d", i, arr[i]);
        }
    }

    if (a != 0 && a != 1)
    {
        printf("\nInvalid characeter! Only '0' and '1' are recognized by the system. ");
    }

    return 0;
}