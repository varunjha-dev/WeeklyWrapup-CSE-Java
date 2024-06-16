package while_loop;

import java.util.Scanner;

public class i_pattern4 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int i=1;
    while (i<=n) {
      int j=1;
      int l = i;
      while (j<=i) {     
        System.out.print(l); // or S.out.print(i+j-1);
        l++;
        j++;
      } 
      System.out.println();
      i++;
    }
    s.close();
  }
  
}
