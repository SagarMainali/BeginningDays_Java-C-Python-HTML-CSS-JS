import java.util.Scanner;
public class palind{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        while(true){
        System.out.println("Please enter a number");
        int a=s.nextInt();
        int b=a;
        int rem, rev=0;
        while(a>0){
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        if(rev==b)
        System.out.println(b+" is a palindrome number");
        else
        System.out.println(b+" is not a palindrome number");
    }
}
}

            
        
        