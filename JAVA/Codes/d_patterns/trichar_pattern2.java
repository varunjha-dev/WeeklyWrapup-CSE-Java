import java.util.Scanner;

public class trichar_pattern2 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    while (i<= n) {
      char value = (char)('A'+i-1);
      int j = 1;
      while (j<=i) {
        System.out.print(value);
        j++;
        value++;
      }
      System.out.println();
      i++;
}
s.close();
  }}