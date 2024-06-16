package c_while_loop;

import java.util.Scanner;

public class b_primeornot {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 2;
    while (i<=n-1) {
      if (n%i==0) {
        System.out.println("Given no. is not Prime");
        s.close(); //ensures that the resource is properly released
        return;
      }
      i++;
    } 
    System.out.println("Given no. is prime");
    s.close();
  }
}
