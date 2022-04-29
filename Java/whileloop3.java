 public class whileloop3//program to print even numbers upto 10 from 0.
{
    public static void main(String[]args)
    {
        int a=0;
        while(a<=10)
        {
            if(a%2==0)//if the remainder is 0 when a is divided by 2.
            System.out.println(a);
            a++;
        }
    }
}