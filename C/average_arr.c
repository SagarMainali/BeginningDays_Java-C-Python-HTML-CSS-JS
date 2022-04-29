#include <stdio.h>
int main()
{
    printf("Enter the size of array :\n");
    int size;
    scanf("%d", &size);
    int arr[size], i;
    int sum = 0;
    printf("Enter elements of array: \n");
    for (i = 0; i < size; i++)
    {
        scanf("%d", &arr[i]);
    }

    for (i = 0; i < size; i++)
    {
        sum = sum + arr[i];
    }

    float avg = sum / size;

    printf("The average of your array is %.2f.\n", avg);
    return 0;
}