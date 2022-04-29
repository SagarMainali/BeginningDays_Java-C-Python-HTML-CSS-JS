public class Palindrome1{
    public static void main(String[] args){
        int on, rem, rev=0;
        System.out.println("\nThese are the palindrome numbers between 1 to 100");
        for (int i=1; i<=100; i++ ){
            on=i;
            while(on>0){
                rem=i%10;
                rev=rev*10+rem;
                on=on/10;
            }
            if(i==rev){
            System.out.print(i+" ");
            }
            rev=0;
        }
    }
}
