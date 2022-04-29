import java.util.Scanner;
public class switch1
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter '1','2' and '3' for coke, fanta and dew repectively.");
        int a=s.nextInt();
        switch(a)
        {
        case 1:System.out.println("Coke");
        case 2:
        System.out.println("Fanta");
        break;
        case 3:
        System.out.println("Dew");
        break;
        default:System.out.println("Shit, you entered wrong number kid");
        
    }
    
}
}

        