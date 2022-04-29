import java.util.Scanner;
public class Stack{
    int[] stck;
    int tos;
    int maxsize;
    Stack(int size){
        tos = -1;
        this.maxsize = size;
        stck = new int[maxsize];
    }
    void Push(int item){
      if(tos ==maxsize-1){
          System.out.println("STACK OVERFLOW");
        }
        stck[++tos] = item;
    }
    int  Pop()
    {
        if (tos<0)
        {
            throw new RuntimeException("STACK UNDERFLOW");
    }
    else {
        return stck[tos--];
    }
   }
    boolean Isempty(){
        return (tos<0);
    }
    boolean isfull(){
        return (tos == maxsize-1);
    }
    public static void main(String [] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the  size of stack:");
       int s = sc.nextInt();
       System.out.println("Enter "+s+" elements to stack:");
       Stack s1 = new Stack(s);
       for(int i =0;i<s;i++){
          int num = sc.nextInt();
          s1.Push(num);
        }
        System.out.println("Stack is full");
       for(int j = 0;j<s;j++)
       {
          System.out.println("Item deleted:"+s1.Pop());
        }
        System.out.println("stack underflow");
        System.out.println("stack is empty");
    }
}