import java.util.Scanner;
public class Palindrome{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number to check whether it is palindrome or not.");
            int n=s.nextInt();
            int rem,rev=0,num=n;
            while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
           if(num==rev){
               System.out.println(num+" is palindrome number.");
            }
            else{
                System.out.println(num+" is not palindrome number.");
            }
        }
    }
}