package c_while_loop;

import java.util.Scanner;

public class h_pattern3 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1, k= 1;
    while (i<=n) {
      int space = 1;
      while (space<=n-i) {
        System.out.print(" ");
        space++;
      }
      int j = 1;
      while (j<=i) {
        System.out.print(k);
        k++;
        j++;
      }
      System.out.println();
      i++;
    }
    s.close();
  }
}