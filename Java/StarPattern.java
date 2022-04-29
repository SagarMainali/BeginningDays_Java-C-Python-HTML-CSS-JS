import java.util.Scanner;
public class StarPattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("\nEnter how many star lines you want to print.");
        int a=s.nextInt();
        for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}