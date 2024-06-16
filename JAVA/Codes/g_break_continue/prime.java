package g_break_continue;
public class prime {
  public static void main(String[] args) {
      int N = 20; // Replace with your input value for N
      for (int i = 2; i <= N; i++) {
          boolean isPrime = true;
          for (int j = 2; j < i; j++) {
              if (i % j == 0) {
                  isPrime = false;
                  break; // Exit the inner loop
              }
          }
          if (isPrime) {
              System.out.println(i); // Print the prime number
          }
      }
  }
}
