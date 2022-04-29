import java.util.Scanner;
public class switchandloop
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int cb=10000,da,wa ,a;
        while(true)
        {
            System.out.println("Welcome! Please enter '1' to check balance, '2' to deposit and '3' to withdraw.");
            a=s.nextInt();
            switch(a)
            {
            case 1:
            System.out.println("Your current balance is "+cb);
            break;
            
            case 2:
            System.out.println("Enter the amount you want to deposit.");
            da=s.nextInt();
            cb=da+cb;
            System.out.println("You have deposited Rs."+da+". Now your balance is Rs."+cb);
            break;
            
            case 3:
            System.out.println("Enter the amount you want to withdraw.");
            wa=s.nextInt();
            if (wa<cb)
            {
            cb=cb-wa;
            System.out.println("You have withdraw Rs."+wa+". Now your balance is Rs."+cb);
            }
            else
            {
            System.out.println("You have insufficient balance.");
            }
            break;
            
            default:
            System.out.println("Error 108! My Frrrriend.");
            break;
            
        }
    }
  }
}

            
            
            
            
            
            
            
            
            
            
            
            