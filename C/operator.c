#include <stdio.h>
int main()
{
    printf("Enter the value of a and b:\n");
    int a, b;
    scanf("%d %d", &a, &b);
    printf("\n%d<%d=%d", a, b, (a < b));
    printf("\n%d>%d=%d", a, b, (a > b));
    printf("\n%d<=%d=%d", a, b, (a <= b));
    printf("\n%d>=%d=%d", a, b, (a >= b));
    return 0;
}