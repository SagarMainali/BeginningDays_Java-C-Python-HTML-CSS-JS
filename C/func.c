#include <stdio.h>
int sum()
{
    int a, b, c;
    printf("Enter two numbers\n");
    scanf("%d%d", &a, &b);
    c = a + b;
    return c;
}
int multiply()
{
    int a, b, c;
    printf("Enter two numbers\n");
    scanf("%d%d", &a, &b);
    c = a * b;
    return c;
}
void rem()
{
    int a, b, c;
    printf("Enter two numbers\n");
    scanf("%d%d", &a, &b);
    c = a % b;
    printf("The remainder of your two numbers is %d\n", c);
}
void main()
{
    int add = sum();
    printf("The sum of your two numbers is %d\n", add);
    int mul = multiply();
    printf("The product of your two numbers is %d\n", mul);
    rem();
}