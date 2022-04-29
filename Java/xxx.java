import java.util.Scanner;

public class xxx {
    public static void main(String[] args) {
        Scanner give = new Scanner(System.in);
        System.out.println("Hey! Enter your First Number.");
        int firstnumber = give.nextInt();
        System.out.println("Now, Enter your Second Number.");
        int secondnumber = give.nextInt();
        give.close();
        if (firstnumber > secondnumber) {
            System.out.println("First Number is greater than the Second Number.");
        }
        if (secondnumber > firstnumber) {
            System.out.println("Second Number is greater than the First Number.");
        }
    }
}