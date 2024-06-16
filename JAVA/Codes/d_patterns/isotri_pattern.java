import java.util.Scanner;

public class isotri_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    while (i<=n) {
      int space = 1;
      while (space<=n-i) {
        System.out.print(" ");
        space++;
      }
      int j = 1;
      while (j<=i) {
        System.out.print(j);
        j++;
      }
      int value = i-1;
      while (value>=1) {
        System.out.print(value);
        value--;
      }
     System.out.println();
     i++;
    }
s.close();
  }
}