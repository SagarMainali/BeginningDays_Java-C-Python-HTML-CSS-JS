//this program replaces the while(true) with while(condition). and the condition is true everytime.w
public class whileloop1
{
    public static void main(String[]args)
    {
        int a=1;
        while(a<2)//always true, so this prints the below statement infinately.
        {
            System.out.println("Sagar is a good guy.");
        }
    }
}