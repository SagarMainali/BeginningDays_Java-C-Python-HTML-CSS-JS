import java.util.Scanner;
public class switchvoc{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=s.next().charAt(0);
        int i=0;
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            i++;
        }
        if(i>0){
            System.out.println(ch+"=vowel");
        }
        else{
           if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
              System.out.println(ch+"=consonant");
           else
              System.out.println("Not an alphabet");
        }
    }
}
