import java.util.Scanner;
public class arms{
    public static void main(String args[]){
        while(true){
        System.out.println("Please enter a number.");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=a;
        int c=a;
        int rem;
        double sum=0;
        int count=0;
        while(a>0){
            a=a/10;
            count++;
        }
        while(b>0){
            rem=b%10;
            sum=sum+Math.pow(rem,count);
            b=b/10;
        }
        if(sum==c)
        System.out.println(c+" is an armstrong number.");
        else
        System.out.println(c+" is not an armstong number.");
        }   
    }
}

        
        
        
        
    
    