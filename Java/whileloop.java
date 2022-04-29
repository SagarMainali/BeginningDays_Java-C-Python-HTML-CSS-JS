public class whileloop
{
    public static void main(String[]args)
    {
        while(true)//here, false doesn't work. Because the execution of false means it is not going
                   //to print the below statement even for a single time. So, it is a programme error.      
        {
            System.out.println("Sagar is a hero");//prints infinately as while condition is always true.
        }
    }
}