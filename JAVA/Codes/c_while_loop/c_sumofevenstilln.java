package c_while_loop;

import java.util.Scanner;

public class c_sumofevenstilln {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=0,sum=0;
    while (i<=n) {
      if (i%2==0) {
        sum = sum +i;
      }
      s.close();
      i++;
    }
    System.out.println("The sum of evens no. till given no. " + sum);
  }
  
}
