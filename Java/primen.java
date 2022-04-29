public class primen{
    public static void main(String args[]){
        System.out.println("\nThese are prime numbers from 1 to 100");
        int a,i,temp;
        for(a=2; a<=100; a++){
            temp=0;
            for(i=2; i<=a/2; i++){
                if(a%i==0)
                temp=1;
            }
            if(temp==0)
            System.out.print(" "+a);
        }
    }
}