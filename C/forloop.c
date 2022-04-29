#include <stdio.h>
int main()
{
    int n;
    printf("How many times do you want to print your name?\n");
    scanf("%d", &n);
    for (int i = 0; i < n; i++)
        printf("Sagar Mainali\n");
    return 0;
}
