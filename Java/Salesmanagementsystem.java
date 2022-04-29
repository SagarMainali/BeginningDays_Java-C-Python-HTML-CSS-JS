import java.util.Scanner;

public class Salesmanagementsystem {

  static float sum = 0;
  static int n = 3;
  static float[] a = new float[n];

  public static void report() {
    System.out.println("Today's sales report");
    for (int i = 0; i < n; i++) {

      System.out.println("today sales for store " + (i + 1) + " : " + a[i]);
    }
  }

  public static void barChart() {
    System.out.println("BARCHART");
    for (int i = 0; i < n; i++) {
      System.out.print("Store " + (i + 1) + " : ");
      for (int j = 0; j < (int) a[i] / 1000; j++) {

        System.out.print("*");
      }

      System.out.println("");

    }
  }

  public static void percentage() {

    System.out.println("Percentage of sales");
    for (int i = 0; i < n; i++) {

      sum += a[i];
    }

    for (int i = 0; i < n; i++) {

      System.out.println("store " + (i + 1) + " : " + (a[i] / sum) * 100 + "%");
    }
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      System.out.println("Enter the amount of total sales for store " + (i + 1));
      a[i] = sc.nextFloat();
    }

    report();
    barChart();
    percentage();

  }
}