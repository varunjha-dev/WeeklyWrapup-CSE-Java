import java.util.Scanner;

public class trichar_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1;
    while (i<= n) {
      int j = 1;
      char value = (char)('A'+i-1);
      while (j<=i) {
        System.out.print(value);
        j++;
      }
      System.out.println();
      i++;
    }
    System.out.println("another approach");
    int l = 1;
    char value1 = 'A';
    while (l<= n) {
      int j = 1;
      while (j<=l) { // j is for coloumn loop
        System.out.print(value1);
        j++;
      }
      System.out.println();
      l++;
      value1++;
    s.close();
  }
}}
