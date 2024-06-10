package while_loop;
import java.util.Scanner;


public class o_power_of_n {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("give the base no.");
    int number = s.nextInt();
    System.out.print("give the power to given no.");
    int power = s.nextInt();
    int i = 1;
    while (power>0) {
      i = i*number;
      power--;
    }
    //double ex = Math.pow(number, power); (Simple method)
    //System.out.println(ex);
    System.out.println(i);
    s.close();
}
}