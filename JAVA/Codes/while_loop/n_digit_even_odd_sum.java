package while_loop;
import java.util.Scanner;

public class n_digit_even_odd_sum {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int number = s.nextInt();
    int even_sum = 0;
    int odd_sum = 0;
    
    while (number>0) {
      int n = number%10; // to get the last digit of the given no.
      if (n%2 == 0) {
        even_sum = even_sum + n;
      }
      else{
        odd_sum = odd_sum +n;
      }
      number = number / 10; //to remove the last digit by retaing the int part
    }
    System.out.println("even digits sum: " + even_sum);
    System.out.println("odd digits sum: " + odd_sum);
    s.close();
  }
  
}
