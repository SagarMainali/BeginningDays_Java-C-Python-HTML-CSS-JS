//find the greatest number among three numbers using "nested if"

import java.util.Scanner;
public class Abc
{
    public static void main(String[]args)
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the first number.");
        a=in.nextInt();
        System.out.println("Enter the second number.");
        b=in.nextInt();
        System.out.println("Enter the third number.");
        c=in.nextInt();
        if(a>b)
        {
          if(a>c)
          System.out.println(a+" is the greatest.");
          else 
          System.out.println(c+" is the greatest.");
        }
        else 
        {
            if(b>c)
            System.out.println(b+" is the greatest.");
            else
            System.out.println(c+" is the greatest.");
        }
    }
} 