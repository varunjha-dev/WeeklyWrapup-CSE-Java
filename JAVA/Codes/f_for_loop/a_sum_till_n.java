package f_for_loop;
import java.util.Scanner;

public class a_sum_till_n {
  // for loop is used where we do initialization;condition;and incr. or decri.
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int sum = 0;
    for (int i = 1; i <= n ;i++){ // for multiple initialisation use , and for multiple condition use logical opetators  and for incr. and decr. use ,
      sum = sum + i;
    }
    System.out.println(sum);
    s.close();
  }
}
