package while_loop;

import java.util.Scanner;

public class m_pattern8 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1;
    while (i<=n) {//Row Loop
      int space = 1;
      while (space<=n-i) { //Space loop 
        System.out.print(" ");
        space++;
      }
      int j=1;
      while (j<=((2*i)-1)) { // star Print Loop 
        System.out.print("*"); 
        j++;
      } 
      System.out.println();
      i++;
    }
    s.close();
  }
}
