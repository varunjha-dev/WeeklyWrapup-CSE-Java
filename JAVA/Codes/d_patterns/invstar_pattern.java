import java.util.Scanner;

public class invstar_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    while (i<=n) {
      int j = 1;
      while (j<= n-i+1) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
    s.close();
}
}