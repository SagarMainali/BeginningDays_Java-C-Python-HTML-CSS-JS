import java.util.Scanner;
public class increment
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number.");
        int q = s.nextInt();
        s.close();
        q++;
        System.out.println(q);
    }
}