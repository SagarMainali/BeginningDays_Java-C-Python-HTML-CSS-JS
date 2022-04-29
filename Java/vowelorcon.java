//this is a program which asks string value from user and compares its letters to eveluate whether it is vowel or consonant
import java.util.Scanner;
public class vowelorcon{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a word.");
        String word=s.next();
        int i;
        int vc=0,cc=0;
        for(i=0; i<word.length(); i++){
            char ch=word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println(ch+"=vowel");
                vc++;
            }
            else{
                System.out.println(ch+"=consonant");
                cc++;
            }
        }
        System.out.println("There are "+vc+" vowels.\nThere are "+cc+" constants.");
    }
}
