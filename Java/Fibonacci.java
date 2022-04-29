import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("\nEnter how many numbers you want to print.");
            int n=s.nextInt();
            int a=1, b=2,c,i=1;
            System.out.print(a+" "+b+" ");
        while(i<=n-2){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
            i++;
          }
        }
    }   
}
                   