import java.io.*; 
import java .util.*; 
  
class Ascending 
{ 
    public static void main (String[] args) 
    { 
        int a[] = {15, 2, 8}; 
  
        Arrays.sort(a); 
  
        for (int i = 0; i < 3; i++)  
            System.out.print( a[i] + " "); 
    } 
} 