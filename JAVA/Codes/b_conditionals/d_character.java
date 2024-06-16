package conditionals;

import java.util.Scanner;

public class d_character {
  public static void main(String[] args) {
    
    Scanner s = new Scanner (System.in);
    char a = s.next().charAt(0);
    if (a>= 'A' && a <= 'Z') {
      System.out.println("the input character is uppercase "+ 1);
    }
    else if (a>= 'a'&& a<='z') {
      System.out.println("the input character is lowercase "+ 0);
    }
    else {
      System.out.println(-1);
    }
s.close();
  }
}
