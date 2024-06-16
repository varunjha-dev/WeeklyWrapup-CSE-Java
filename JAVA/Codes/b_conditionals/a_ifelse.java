package b_conditionals;

import java.util.Scanner;

public class a_ifelse {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Give the number to find whether it is even or not:");
    int n = s.nextInt();
    int rem = n % 2;
    if (rem == 0) {
      System.out.println("Even");
    } else {
      System.out.println("Odd");
    }
    s.close();
  }
}
