import java.util.Scanner;

public class trichar_pattern3 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    // or int k = n; (to mangae Row Loop)
    while (i<= n) {
      char value = (char)('A'+n-i);// char value = (char)('A'+k-1);
      int j = 1;
      while (j<=i) {
        System.out.print(value);
        j++;
        value++;
      }
      System.out.println();
      i++;
      // or k--;
}
s.close();
  }
}
