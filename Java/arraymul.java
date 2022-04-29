import java.util.Scanner;
public class arraymul{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Below is a program for array multiplication");
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int a[][]=new int[size][size];
        int b[][]=new int[size][size];
        int m[][]=new int[size][size];
        int i,j,k,sum=0;
        
        System.out.println("Enter the first array data:");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                a[i][j]=s.nextInt();
            }
        }    
        
        System.out.println("\nEnter the second array data:");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                b[i][j]=s.nextInt();
            }
        }
        
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                for(k=0; k<size; k++){
                    sum=sum+a[i][k]*b[k][j];
                }
                m[i][j]=sum;
                sum=0;
            }
        }
        
        System.out.println("The multiplication of array a and array b are:");
        for(i=0; i<size; i++){
            for(j=0; j<size; j++){
                System.out.print(m[i][j]+"\t");
            }
            System.out.println();
        }
    }
}




                
        
        