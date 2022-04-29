import java.util.Scanner;

public class Askinginputfromuser {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please, enter the first number.");
        int a = input.nextInt();
        System.out.println("Please, enter the second number.");
        int b = input.nextInt();
        input.close();
        int sum = a + b;
        int sub = a - b;
        int multiplication = a * b;
        int division = a / b;
        System.out.println("The answers of sum, sub, multiplication and division of the numbers " + a + " and " + b
                + " are " + sum + ", " + sub + ", " + multiplication + " and " + division + " respectively.");
    }
}
