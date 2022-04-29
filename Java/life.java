import java.util.Scanner;
public class life
{
    public static void main(String[]args)
    {
        Scanner type=new Scanner(System.in);
        System.out.println("Enter the three numbers");
        float a=type.nextInt();
        float b=type.nextInt();
        float c=type.nextInt();
        float mean=(a+b+c)/2;
        System.out.println("The average mean of "+a+" "+b+" and "+c+" is "+mean+".");
    }
}
