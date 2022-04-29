import java.util.Scanner;
public class whileloop5
{
    public static void main(String[]args)
    {
        Scanner in=new Scanner(System.in);
        while(true)
        {
            System.out.println("Please, enter a number.");
            int num=in.nextInt();
            int a=1, fact=1;
            while(num>=a)
            {
                fact=fact*a;
                a++;
            }
            System.out.println(fact);
        }
    }
}
            
            