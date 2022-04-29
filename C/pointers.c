#include <stdio.h>
int main()
{
    int a = 5;
    int *ptr = &a;
    printf("%d\n", *ptr);
    printf("%p\n", ptr);
    printf("%p", &ptr);
}