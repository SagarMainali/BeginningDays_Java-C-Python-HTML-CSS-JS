//find the greatest number among three numbers using if, else..if statement
import java.util.Scanner;
public class Xyz
{
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the three numbers.");
        int x,y,z;
        x=input.nextInt();
        y=input.nextInt();
        z = input.nextInt();
        input.close();
        if(x>y && x>z)
        {
            System.out.println(x+" is the greatest.");
        }
        else if(y>x && y>z)
        {
            System.out.println(y+" is the greatest.");
        }
        else if(z>x && z>y)
        {
        System.out.println(z+" is the greatest");
        }
    }
}