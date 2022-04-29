import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number kid.");
        int a = input.nextInt();
        System.out.println("Enter the second number kid.");
        int b = input.nextInt();
        input.close();
        System.out.println("Is " + a + " greater than " + b);
        System.out.println(a > b);
    }
}