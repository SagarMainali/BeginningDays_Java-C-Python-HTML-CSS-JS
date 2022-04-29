#include <stdio.h>
int iterativeBinarySearch(int arr[], int s_index, int e_index, int number){
   while (s_index <= e_index){
      int middle = s_index + (e_index- s_index )/2;
      if (arr[middle] == number)
         return middle;
      if (arr[middle] < number)
         s_index = middle + 1;
      else
         e_index = middle - 1;
   }
   return -1;
}
int main(void){
   int arr[] = {1, 9, 34, 12, 69, 45, 135, 903, 445, 27};
   int n = 10;
   printf("Enter a number:\n");
   int number;
   scanf("%d", &number);

   int idx = iterativeBinarySearch(arr, 0, n-1, number);
   if(idx == -1 ) {
      printf("Element not found in the array. ");
   }
   else {
      printf("Element found at index : %d",idx);
   }
   return 0;
}