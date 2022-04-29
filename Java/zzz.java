import java.util.Scanner;
public class zzz
{
    public static void main(String[]args)
    {
        Scanner give=new Scanner(System.in);
        System.out.println("Hey! Enter your First Number.");
        int firstnumber = give.nextInt();
        give.close();
        System.out.println("Now, Enter your Second Number.");
        int secondnumber=give.nextInt();
        if (firstnumber>secondnumber)
        {
            System.out.println("First Number is greater than the Second Number.");
        }
        else
        {
            System.out.println("First Number is less than the Second Number.");
        }
    }
}