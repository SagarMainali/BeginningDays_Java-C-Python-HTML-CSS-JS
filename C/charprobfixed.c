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

    char ch;
    int s = 0;
    printf("\n\nHow do you want to sort these array elements?\nEnter 'A' for ascending or 'D' for Descending:");
    scanf(" %c", &ch);

    if (ch == 'A' || ch == 'a')
    {
        printf("\nHere are the elements in ascending order :");
        for (i = 0; i < size; i++)
        {
            printf("\narr[%d] = %d", i, arr[i]);
        }
        s = 1;
    }

    if (ch == 'D' || ch == 'd')
    {
        printf("\nHere are the elements in descending order :");
        for (i = size - 1; 0 <= i; i--)
        {
            printf("\narr[%d] = %d", i, arr[i]);
        }
        s = 1;
    }

    if (s == 0)
    //Alternative -->> if (ch != 'A' && ch != 'D' && ch != 'a' && ch != 'd')
    {
        printf("\nInvalid characeter! Only 'A' and 'D' are recognized by the system. ");
    }
    return 0;
}