#include <stdio.h>
int main()
{
    char fname[20], lname[20];
    printf("Enter your first name: ");
    scanf("%s", fname);
    printf("Enter your second name: ");
    scanf("%s", lname);
    printf("Your full name is %s %s", fname, lname);
    return 0;
}