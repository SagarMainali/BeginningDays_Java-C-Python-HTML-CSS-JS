//display 5 times using recursion
#include <stdio.h>
void display(int);
void main()
{
    display(5);
}
void display(int n)
{

    if (n > 0)
    {
        printf("Hello World\n");
        display(n - 1);
    }
}