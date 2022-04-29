import java.util.*;
public class CaesarCipherProgram {
        public static void main(String args[]) { 
        String ciphertext ="znk waoiq hxuct lud pasvy ubkx znk rgfe jum";
        int shift = 6; 
        String decryptMessage = "";
        for(int i=0; i < ciphertext.length();i++)  
        {
            char alphabet = ciphertext.charAt(i);
            if(alphabet >= 'a' && alphabet <= 'z')
            {
                alphabet = (char) (alphabet - shift);
                if(alphabet < 'a') {
                    alphabet = (char) (alphabet-'a'+'z'+1);
                }
                decryptMessage = decryptMessage + alphabet;
            }    
            else if(alphabet >= 'A' && alphabet <= 'Z')
            {
                alphabet = (char) (alphabet - shift);
                if (alphabet < 'A') {
                    alphabet = (char) (alphabet-'A'+'Z'+1);
                }
                decryptMessage = decryptMessage + alphabet;            
            }
            else 
            {
             decryptMessage = decryptMessage + alphabet;            
            } 
        }
        System.out.println(" decrypt message : " + decryptMessage);
    }
}