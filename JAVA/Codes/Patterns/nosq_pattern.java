import java.util.Scanner;

public class nosq_pattern {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1; // i is for row loop 
    while (i<= n) {
      int j = 1;
      while (j<=n) { // j is for coloumn loop
        System.out.print(i);
        j++;
      }
      System.out.println();
      i++;
    }
    s.close();
}
}