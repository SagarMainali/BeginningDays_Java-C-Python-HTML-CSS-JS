import java.util.Scanner;
public class mean
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the first number");
        float num1=input.nextInt();
        System.out.println("Enter the second mumber");
        float num2 = input.nextInt();
        input.close();
        float division=num1/num2;
        System.out.println("The division of the numbers "+num1+" and "+num2+" is "+division+".");
    }
}