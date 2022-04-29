//this is a program to find factorial using recursion
#include<stdio.h>
int fact(int);
void main(){
    int n, factorial;
    printf("Enter a number to find the factorial:\n");
    scanf("%d",&n);
    factorial=fact(n);
    printf("%d! = %d", n, factorial);
}
int fact(int n){
    if(n>0)
    return n*fact(n-1);
    else
    return 1;
}