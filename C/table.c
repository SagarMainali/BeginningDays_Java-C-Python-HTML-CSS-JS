#include<stdio.h>
int main(){
   printf("Enter a number to print its multiplication table.\n");
   int number, mul;
   scanf("%d",&number);
   printf("The multiplication of %d is: \n",number);
   for(int i=1; i<11; i++){
      mul= number*i; 
      printf("%d * %d = %d\n", number, i, mul);
}
}