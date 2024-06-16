package while_loop;

import java.util.Scanner;

public class a_print_numbers {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i = 0;
    while (i<n) {
      System.out.println(i);
      i++;
    }
    s.close();
  }
  
}
