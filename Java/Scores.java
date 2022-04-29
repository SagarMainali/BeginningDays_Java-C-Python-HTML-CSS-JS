import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
public class Scores {
    static double [] array= new double[150];
    public static void main(String[] args) throws Exception{
        File file= new File("src/com/company/data7.txt");
        Scanner fileinput  = new Scanner(file);
        PrintWriter out = new PrintWriter("output2.txt");
        int number =  readArray(fileinput,array);
        printArray( out,array,number,7);
    }
    public static int readArray(Scanner fl, double[] x) throws FileNotFoundException {
        int countfile=0;
        Scanner fileinput = new Scanner(new File("src/com/company/data7.txt"));
        while(fileinput.hasNext()){
            String line = fileinput.nextLine();
            countfile++;
        }
        for (int i = 0 ; i< countfile; i ++){
            x[i]= Double.parseDouble(fl.nextLine());
        }
        array= x;
        return countfile;
    }
    public static void printArray(PrintWriter fl, double[] a, int num, int ls){
        for ( int i = 0; i < num;i++ ){
            for (int j = i ; j< i + ls;j++ ){
                fl.write(a[j]+" ");
            }
            i+=ls-1;
            fl.write("\n");
        }
        fl.write("There are "+num+" numbers in array");
        double mean = calcMean(array,num);
        fl.write("\nwith a mean of "+ mean );
        fl.close();
    }
    public static double calcMean(double[] a, int num){
        double sum= 0 ;
        for ( int i = 0 ; i < num ; i ++){
            sum += a[i];
        }
        return sum/num;
    }
}