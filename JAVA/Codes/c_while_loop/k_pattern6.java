package c_while_loop;

import java.util.Scanner;

public class k_pattern6 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1;
    while (i<=n) {//Row Loop
      int j=1;
      while (j<= i) { // star Print Loop 
        System.out.print("*"); 
        j++;
      } 
      System.out.println();
      i++;
    }
    s.close();
  }
}
