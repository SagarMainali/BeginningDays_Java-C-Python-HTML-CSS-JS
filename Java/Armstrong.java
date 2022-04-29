import java.util.Scanner;
public class Armstrong{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number to check whether it is an armstrong number or not.");
            int num = s.nextInt();
            int orig_num = num;
            int num1 = num;
            int count = 0, rem;
            double sum = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }
            while (num1 > 0) {
                rem = num1 % 10;
                sum = sum + Math.pow(rem, count);
                num1 = num1 / 10;
            }
            if (orig_num == sum) {
                System.out.println(orig_num + " is an Armstrong number.");
            } else {
                System.out.println(orig_num + " is not an Armstrong number.");
            }
        }
    }
}