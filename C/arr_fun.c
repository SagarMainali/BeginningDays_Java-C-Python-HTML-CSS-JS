//passing array in function
#include <stdio.h>  
int summation(int[]);  
void main ()  
{  
    int arr[5] = {0,1,2,3,4};  
    int sum = summation(arr);   
    printf("%d",sum);   
}   
  
int summation (int array[])   
{  
    int sum=0,i;   
    for (i = 0; i<5; i++)   
    {  
        sum = sum + array[i];   
    }   
    return sum;   
}  