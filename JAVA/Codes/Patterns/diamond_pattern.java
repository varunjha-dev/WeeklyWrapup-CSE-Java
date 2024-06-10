import java.util.Scanner;

public class diamond_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int n1 = (n/2)+1;
    int i = 1;
    while (i<=n1) {
      int space = 1;
      while (space<= (n1-i)) {
        System.err.print(" ");
        space++;
      }
      int j = 1;
      while (j<=(2*i)-1) {
        System.out.print("*");
        j++;
      }
    i++;
    System.out.println();
    }
    int n2 = n-n1;
    i=n2;
    while (i>=1) {
     int space = 1;
     while (space<= n1-i) {
      System.out.print(" ");
      space++;
     }
     int j = 1;
     while (j<=(2*i)-1) {
      System.out.print("*");
      j++;
     }
     i--;
     System.out.println();
    }
    s.close();
}
}