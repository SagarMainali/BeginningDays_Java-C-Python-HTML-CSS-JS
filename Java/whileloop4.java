//find the factorial
import java.util.Scanner;
public class whileloop4
{
    public static void main(String[]args)
    {
       Scanner s = new Scanner(System.in);
       int num,fact=1, a=1;
       System.out.println("Enter the number which factorial you want to calculate.");
       num=s.nextInt();
       while(a<=num)
       {
       fact=fact*a;
       a++;
       }
       System.out.println("The factorial of "+num+" is "+fact);
    }
}


           