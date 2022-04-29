//this is 2D array and it asks input from user in array1 and array2 and calculate their sum
import java.util.Scanner;
public class arr{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int l1=2, l2=2;
        int[][] a=new int[l1][l2];
        int[][] b=new int[l1][l2];
        int[][] sum=new int[l1][l2];
        int i,j;
        System.out.println("Enter the 1st array numbers:");
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                a[i][j]=s.nextInt();
            }
        }
        System.out.println("\nThe number stored in 1st array are:");
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                System.out.print("a["+i+"]["+j+"]="+a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("\nEnter the 2nd array numbers:");
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                b[i][j]=s.nextInt();
            }
        }
        System.out.println("\nThe number stored in 2nd array are:");
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                System.out.print("b["+i+"]["+j+"]="+b[i][j]+" ");
            }
            System.out.println();
        }
        
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("\nThe sum of 1st and 2nd array is:");
        for(i=0; i<l1; i++){
            for(j=0; j<l2; j++){
                System.out.print("sum["+i+"]["+j+"]="+sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}

        
                
                
        
        
        
   
        
        
        