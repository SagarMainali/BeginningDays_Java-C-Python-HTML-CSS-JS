//find the given number is prime number or not
import java.util.Scanner;
public class forloop4
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int a;
        while(true){
            
            System.out.println("Enter a number.");
            int num=s.nextInt();
            int b=0;
            for(a=2; a<=num/2; a++){
            if(num%a==0)
            b++;
        }
        if (b==0)
        {
            System.out.println(num+" is a prime number");
        }
        else 
        {
            System.out.println(num+" is not a prime number.");
        }
      }
    }
}
            
            
                    