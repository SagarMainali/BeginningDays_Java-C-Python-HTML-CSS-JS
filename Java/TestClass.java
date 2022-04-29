import java.util.Scanner;
       public class TestClass       {     
public static void main(String[] args) {  
     int n;              
     int large=0;
     int secondLarge=0;   
    int count=0;
        Scanner s=new Scanner(System.in);
 System.out.println("Enter array size");
int size=s.nextInt();    
int arr[]=new int[size];
System.out.println("enter the numbers");
for(int i=1; i>0&&i<size; i++){
arr[i]=s.nextInt();
count++;
}
count--;
System.out.println("count = "+count);
}
}
 
