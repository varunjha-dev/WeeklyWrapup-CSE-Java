package while_loop;

import java.util.Scanner;

public class d_fahtocel {
  public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
    int low = s.nextInt();
    int high = s.nextInt();
    int steps = s.nextInt();
    int i = low;
    System.out.println("The final printed output will be:");
    while (i<=high) {
      int cel = (int)((5.0/9)*(i-32));
      System.out.println(i + "\tFah to cel\t" + cel);
      i = i + steps;
    }
    
    s.close();
  }
}
