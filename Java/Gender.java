
//I just had to use gender.equals(""),,,,so....
import java.util.Scanner;

public class Gender {

  public static void main(String[] args) {
    System.out.println("To know your gender, type whether you are 'boy' or 'girl'.");
    Scanner input = new Scanner(System.in);
    String gender = input.nextLine();
    input.close();
    if (gender.equals("boy")) {
      System.out.println("Sorry, you are male.");
    }
    if (gender.equals("girl")) {
      System.out.println("Congratulations, you are female.");
    }
  }
}