import java.util.Scanner;
public class eoo{
    public static void main(String[]args){
        while(true){
        System.out.println("Enter a number");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a%2==0)
        {
            System.out.println(a+" is an even number");
        }
        else 
        {
            System.out.println(a+" is an odd number");
        }
    }
}
}

    