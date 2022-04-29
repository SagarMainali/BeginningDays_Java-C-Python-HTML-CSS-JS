import java.util.Scanner;
public class arr1{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array.");
        int size=s.nextInt();
        int[] a=new int[size];
        int i,j,temp;
        System.out.println("Enter any "+size+" numbers:");
        for(i=0; i<size; i++){
            a[i]=s.nextInt();
        }
        System.out.println("The numbers you stored in array are:");
        for(i=0; i<size; i++){
            System.out.println("a["+i+"]="+a[i]+" ");
        }
        for(i=1; i<size; i++){
            if(a[0]<a[i])
            {
                a[0]=a[i];
            }
        }
        System.out.println("\nThe largest number in array is "+a[0]+".");
        for(i=0; i<size; i++){
            for(j=i+1; j<size; j++){
                if(a[i]>a[j]){
                temp=a[i];
                a[i]=a[j];
                a[j]=temp;
                }
            }
        }
        System.out.println("\nThe numbers in ascending order are:");
        for(i=0; i<size; i++){
            System.out.print(a[i]+" " );
        }
    }
}

            
        
            
        
        