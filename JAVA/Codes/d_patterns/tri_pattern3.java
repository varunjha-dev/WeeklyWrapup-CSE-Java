import java.util.Scanner;

public class tri_pattern3 {
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("give no. of rows to print");
    int n = s.nextInt();
    int i = 1; // i is for row loop 
    while (i<= n) {
      int j = 1;
      while (j<=i) { // j is for coloumn loop
        System.out.print(i-j+1);
        j++;
      }
      System.out.println();
      i++;
    }
    System.out.println("another approach");
    int l = 1; // l is for row loop
    while (l<= n) {
      int j = 1; 
      int k = l;
      while (j<=l) { // j is for coloumn loop
        System.out.print(k);
        j++;
        k--;
      }
      System.out.println();
      l++;
    s.close();
}
}
}