//operations in array structure(unsorted)
#include <stdio.h>
#include <conio.h>
void insert_at_end(int[], int);
void insert_at_beginning(int[], int);
void insert_at_mid(int[], int);
int main()
{
    int array[20], size, i;
    char ch;
    printf("Enter the size of arary:\n=> ");
    scanf("%d", &size);
    if (size < 20)
    {
        printf("Enter any %d elements:\n", size);
        for (i = 0; i < size; i++)
        {
            scanf("%d", &array[i]);
        }
    }
    else
        printf("The size can't be greater than 50!");
    printf("Press any key to display the array elements......\n");
    getch();

    //traverse in array
    for (i = 0; i < size; i++)
    {
        printf("array[%d] = %d\n", i, array[i]);
    }

    //inserting elements
    // i) at the end
    printf("Enter 'y' if you like to insert element at the end or 'n' to discard:\n=> ");
    scanf(" %c", &ch);
    if (ch == 'y')
    {
        insert_at_end(array, size);
        size += 1;
    }
    else if (ch == 'n')
        printf("No element inserted at the end.\n");
    else
        printf("Invalid character!!!");

    // ii) at the beginning
    printf("Enter 'y' if you like to insert element at the beginning or 'n' to discard:\n=> ");
    scanf(" %c", &ch);
    if (ch == 'y')
    {
        insert_at_beginning(array, size);
        size += 1;
    }
    else if (ch == 'n')
        printf("No element inserted at the end.\n");
    else
        printf("Invalid character!!!");

    // iii) at specific position
    printf("Enter 'y' if you like to insert element at specific position or 'n' to discard:\n=> ");
    scanf(" %c", &ch);
    if (ch == 'y')
    {
        insert_at_mid(array, size);
        size += 1;
    }
    else if (ch == 'n')
        printf("No element inserted at the end.\n");
    else
        printf("Invalid character!!!");
}

// functions definitions...
void insert_at_end(int arr[], int length)
{
    printf("Enter the element to store at the end:\n=> ");
    int element, i;
    scanf("%d", &element);
    length += 1;
    arr[length - 1] = element;
    printf("Element added at the end:\n");
    for (i = 0; i < length; i++)
    {
        printf("array[%d] = %d\n", i, arr[i]);
    }
}

void insert_at_beginning(int arr[], int length)
{
    printf("Enter the element you want to store at the beginning:\n=> ");
    int element, i;
    scanf("%d", &element);
    length += 1;
    for (i = length - 1; i > 0; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[0] = element;
    printf("Element added at the beginning:\n");
    for (i = 0; i < length; i++)
    {
        printf("array[%d] = %d\n", i, arr[i]);
    }
}
void insert_at_mid(int arr[], int length)
{
    printf("Enter the element you want to store at some specific position:\n=> ");
    int element, index, i;
    scanf("%d", &element);
    length += 1;
    printf("Enter the index where you want to store the element:\n=> ");
    scanf("%d", &index);
    for (i = length - 1; i >= index; i--)
    {
        arr[i] = arr[i - 1];
    }
    arr[index] = element;
    printf("Element added at index no. %d:\n", index);
    printf("The elements with their index is:");
    for (i = 0; i < length; i++)
    {
        printf("array[%d] = %d\n", i, arr[i]);
    }
    printf("*************");
}