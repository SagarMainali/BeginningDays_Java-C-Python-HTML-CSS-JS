//this program prints the statement until the condition is true and then after the while loop finishes, the line after while loop is executed
public class whileloop2
{
    public static void main(String[]args)
    {
        int a = 10;
        while(a<20)
        {
            System.out.println("Sagar is a good guy.");//prints until the while condition is false.
            a++;
        }
        System.out.println("Not anymore.");//this line is only executed when the above lines are done executing.
    }
}