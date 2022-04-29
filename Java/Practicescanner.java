import java.util.Scanner;

public class Practicescanner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        float a = input.nextInt();
        float b = input.nextInt();
        input.close();
        float division = a / b;
        System.out.println("The division of " + a + " and " + b + " is " + division + ".");
    }
}
