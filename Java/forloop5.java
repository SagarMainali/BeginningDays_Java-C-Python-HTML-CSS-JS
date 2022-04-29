//this is a program to print the prime numbers from 1 to 100
public class forloop5{
    public static void main(String args[]){
        System.out.println("\nBelow are the prime numbers from 1 to 100.");
        int num, temp, i;
        for(num=2; num<100; num++){
            temp=0;
            for(i=2; i<=num/2; i++){
                if(num%i==0)
                temp=1;
            }
            if(temp==0){
                System.out.print(num+" ");
            }
        }
    }
}


    
  
            
            
                          
    