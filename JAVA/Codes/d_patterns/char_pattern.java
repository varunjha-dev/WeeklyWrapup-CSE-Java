import java.util.Scanner;

public class char_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    while (i<= n) {
      int j = 1;
      while (j<=n) {
        char value = (char)('A'+j-1);
        System.out.print(value);
        j++;
      }
      System.out.println();
      i++;
    }

    System.out.println("another approach");
    int l = 1;
    while (l<= n) {
      int j = 1;
      char value1 = 'A';
      while (j<=n) { // j is for coloumn loop
        System.out.print(value1);
        j++;
        value1++;
      }
      System.out.println();
      l++;
    s.close();
  }
}
}