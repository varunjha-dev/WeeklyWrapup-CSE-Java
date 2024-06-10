import java.util.Scanner;

public class tri_pattern4 {
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
      int value = i;
      while (j<=i) {
        System.out.print(value);
        j++;
        value++;
    }
    value = ((2*i)-2);
    j = 1;
    while (j<=i-1) {
      System.out.print(value);
      value--;
      j++;
    }
      System.out.println();
      i++;
    }
    s.close();
  }
}
