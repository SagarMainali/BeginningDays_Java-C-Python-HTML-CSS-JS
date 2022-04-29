import java.util.Scanner;
class Student{
    String name;
    int age;
    int mark[];
    Student(String name, int age){
        this.name=name;
        this.age=age;
        this.mark=new int[3];
    }
    int getTotal(){
        int sum=0;
        for(int i=0; i<3; i++){
            sum=sum+this.mark[i];
            }
            return sum;
    }
    void display(){
        System.out.println("Name="+this.name+"\nAge="+this.age+"\nTotal marks="+(this.getTotal()));
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Student a=new Student("Sagar", 20);
        System.out.println("Enter the marks of three subjects.");
        for(int i=0; i<3; i++){
            a.mark[i]=s.nextInt();
        }
        a.display();
    }
}

        
                         