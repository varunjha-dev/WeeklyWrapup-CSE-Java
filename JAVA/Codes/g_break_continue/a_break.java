package g_break_continue;
import java.util.Scanner;

public class a_break {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give the no.");
    int n = s.nextInt();
    boolean isPrime = n > 1; // Assume n is prime if it's greater than 1
    for (int i = 2; i*i <= n; i++) {
      if (n % i == 0) {
        isPrime = false; // Set isPrime to false if n is divisible by i
        break; // Exit the loop if n is not prime
      }
    }
    
    if(isPrime) { // if block gets executed when the isprime is true
      System.out.println("Prime");
    } else {
      System.out.println("Non Prime");
    }
    
    s.close();
  }
}
