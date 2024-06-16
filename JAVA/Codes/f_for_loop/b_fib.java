package f_for_loop;
import java.util.Scanner;

public class b_fib {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give the no.");
    int n = s.nextInt();
    int a = 0;
    int b = 1;
    System.out.print(a +"\t");
    System.out.print(b +"\t");
    int sum = a+b;
    for (int i = 1; i < n ; i++){
      int fib = a + b ;
      a=b;
      b=fib;
      System.out.print(fib+"\t");
      sum = sum + fib;
    }
    System.out.println();
    System.out.println("sum of fib no. "+ sum);
    s.close();
  }
}
/* in for loop 
 * initialization half use only first time 
 * condition half use every time before loop enter
 * increment or decrement half every time when you complete one iteration
 */
