package basics;
import java.util.*;
public class h_Operators {
  public static void main(String[] args) {
    //Arithmetic Operators
    /*
    System.out.println(9/5);
    System.out.println(9.0/5);
    System.out.println(9+5);
    System.out.println(9-5);
    System.out.println(9*5);
    System.out.println(9%5);
    System.out.println('A'+1);
    System.out.println('a'+'b');
    char c = 'a';
    char i =(char)(c+3);
    System.out.println(i);
    System.out.println('a'/3);
    */
    //Relational Operators
    /*
    Scanner s = new Scanner(System.in);
    int i = s.nextInt();
    int j = s.nextInt();
    boolean eq = (i==j);
    boolean not = (i!=j);
    boolean gr = (i>j);
    boolean greq = (i>=j);
    boolean le = (i<j);
    boolean leeq = (i<j);
  
    System.out.println(eq);
    System.out.println(not);
    System.out.println(gr);
    System.out.println(greq);
    System.out.println(le);
    System.out.println(leeq);
    s.close();
    */
    //Logical Operator 
    Scanner s = new Scanner(System.in);
    int a = s.nextInt();
    int b = s.nextInt();
    int c = s.nextInt();

    boolean isALargest = (a>=b)&&(a>=c);
    System.out.println(isALargest);
    System.out.println((a>=b)||(a>=c));
    System.out.println(!(a>=b));

    s.close();
  }
}
