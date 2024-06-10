package while_loop;

import java.util.Scanner;

public class l_pattern7 {
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
      while (j<=i) { // star Print Loop 
        System.out.print("*"); 
        j++;
      } 
      System.out.println();
      i++;
    }
    s.close();
  }
  
}
