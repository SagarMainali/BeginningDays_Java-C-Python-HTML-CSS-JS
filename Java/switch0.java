//Date is 3rd December,2019.
//this is a program  which guides user to process the ATM.
import java.util.Scanner;
public class switch0
{
    public static void main(String[]args)
    {
        int a=5000;
        int deposit,withdraw,z,total1,total2,w;
        String x="Sagar";
        String y="Rastriya Banijya Bank";
        Scanner in=new Scanner(System.in);        
        System.out.println("Hey! Mr."+x+", Welcome to "+y+".");
        System.out.println("Enter '1' to check balance, '2' to deposit and '3' to withdraw.");
        z=in.nextInt();//this is for the cases inside the switch actually not for the switch z.
        switch(z)
        {
            case 1://this simply lets user to check their account balance.
            System.out.println("Mr."+x+", welcome to "+y+". Your current balance is Rs."+a+".");
            break;
            
            case 2://this lets user to deposit the amount and show the new balance after the deposition. 
            System.out.println("Please, enter how much amount you want to deposit.");
            deposit=in.nextInt();
            total1=a+deposit;
            System.out.println("Mr."+x+", you have successfully deposited Rs."+deposit+" in "+y+" and your new balance is Rs."+total1+".");
            break;
             
            case 3://this lets user to withdraw amount from their current balance. In case of withdraw amount is greater than their current balance, it shows a message alerting 
                   //the user that they cannot withdraw the amount that is greater than their current balance. Again, in case of user withdrawing all amount, it shows an alert 
                   //message asking for the confirmation to still proceed.
            System.out.println("Please, enter how much amount you want to withdraw.");
            withdraw=in.nextInt();
            total2=a-withdraw;
            if(withdraw<a)
            {
            System.out.println("Mr."+x+", you have successfully withdrawn Rs."+withdraw+" and your new balance is Rs."+total2+".");
            }
            else if(withdraw>a)
            {
            System.out.println("Sorry, you cannot withdraw Rs."+withdraw+" because your withdraw is greater than your current balance.\nYou can only withdraw amount less than or equal to Rs."+a);    
            }
            if(withdraw==a)//nested if is being used in this line.
            {
            System.out.println("Alert: Are you sure you want to proceed to withdraw Rs."+withdraw+" because that is the total balance in your account.\nIf you want to cancel the process, press'9' and if you still want to withdraw all the money press '0'");    
            w=in.nextInt();
            if(w==0)            
            System.out.println("You have withdrawn all amount from your account i.e Rs."+a+". Now your current balance is Rs."+(a-withdraw));
            else if(w==9)
            System.out.println("You have cancelled the process to withdraw all amount form your account.");
            else
            System.out.println("Please, enter the right value.");
            }
            break;
             
            default://this lime executes only when user inputs other values rather than 1,2 or 3 which are cases for showing current balance, depositing and withdrawing respectively.
            System.out.println("Error !192! Please, enter the correct value.");
            break;
        }
    }
}
            
        
    