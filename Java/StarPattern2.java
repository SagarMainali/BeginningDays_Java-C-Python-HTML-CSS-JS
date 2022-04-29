//prints odd number of stars in each line.
import java.util.Scanner;
public class StarPattern2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter how many star lines you want to print.");
        int a=s.nextInt();
        int i,j;
        for(i=1; i<=a; i++){
            for(j=1; j<=2*i-1; j++){
                System.out.print("*"+"  ");
            }
            System.out.println();
        }
    }
}