import java.util.Scanner;
public class forloop3
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter a number.");
            int a=s.nextInt();
            int b, fact=1;
            for(b=1; b<=a; b++)
            {
                fact=fact*b;
            }
                System.out.println(fact);
        } 
    }
}
                