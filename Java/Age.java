import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.println("To find your age, enter the year you were born.");
        int year = a.nextInt();
        a.close();
        int age = 2021 - year;
        System.out.println("You are " + age + " years old.");
    }
}