import java.util.Scanner;
public class findgender
{
    public static void main(String[]args)
    {
        System.out.println("Please mention you have 'penis' or 'vagina'.");
        Scanner s=new Scanner(System.in);
        String g = s.nextLine();
        s.close();
        if (g.equals("penis"))
        {
            System.out.println("You are male.");
        }
        if (g.equals("vagina"))
        {
        System.out.println("You are female.");
        }
    }
}   