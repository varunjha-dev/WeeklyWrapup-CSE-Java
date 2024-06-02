package conditionals;

import java.util.Scanner;

public class c_int_to_string {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    if (a==1) {
      System.out.println("one");
    }

    else if (a==2) {
      System.out.println("Two");
    }
    else if (a==3){
      System.out.println("Three");
    }
    s.close();
  }
  
}
