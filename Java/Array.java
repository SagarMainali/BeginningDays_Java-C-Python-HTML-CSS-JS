//this is 1D array and it takes input from user and show it and compare the numberes to print the largest.
import java.util.Scanner;
public class Array{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
        System.out.println("\nEnter how many elements you want to store.");
        int size=s.nextInt();
        int arr[]=new int[size];
        int i,sum=0;
        System.out.println("Enter "+size+" elements.");
        for(i=0; i<size; i++){
           arr[i]=s.nextInt();
           sum=sum+arr[i];
        }
        System.out.println("Here are the elements you entered and are stored as:");
        for(i=0; i<size; i++){
           System.out.println("arr["+i+"]="+arr[i]);
        }
        System.out.println("The sum of those elements is "+sum);
        for(i=1; i<size; i++){
            if(arr[i]>arr[0])//it always compares different number with only the number stored in arr[0]
            arr[0]=arr[i];//line 21 and 22 says if there is any number greater than the number stored in arr[0] then store that number in arr[0]
        }
         System.out.println("The greatest number is "+arr[0]);   
    }
  }
}

        