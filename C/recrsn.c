//sum of n natural numbers using recursion
#include <stdio.h>
int addNumbers(int n){
     if (n != 0)
        return n + addNumbers(n - 1);
    else
        return n;

}
int main() {
    int num;
    printf("Enter a number: ");
    scanf("%d", &num);
    printf("The sum is = %d", addNumbers(num));
    return 0;
}