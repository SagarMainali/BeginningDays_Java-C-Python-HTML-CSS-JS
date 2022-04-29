#include <stdio.h>
int main()
{
    int arr[7] = {45, 23, 6, 12, 1, 98, 123};
    printf("Enter which number you want to search:\n");
    int n, i, found = 0;
    scanf("%d", &n);
    for (i = 0; i < 7; i++)
    {
        if (n == arr[i])
        {
            printf("\nElement found at arr[%d].", i);
            found = 1;
        }
    }
    if (found == 0)
        printf("Element is not found in the array.\n");

    return 0;
}