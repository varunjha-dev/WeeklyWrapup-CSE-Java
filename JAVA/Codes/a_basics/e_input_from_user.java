package a_basics;
import java.util.Scanner;

public class e_input_from_user {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    // int a = scn.nextInt();
    // int b = scn.nextInt();
    // int sum = a+b;
    // System.out.println(sum);
    int p = scn.nextInt();
    int r = scn.nextInt();
    int t = scn.nextInt();
    long l = scn.nextLong();
    double d = scn.nextDouble();
    float f = scn.nextFloat();
    String s = scn.nextLine();// character input from user is forbade in scanner hence use string 
    int si = (p*r*t)/100;
    System.out.println(si);
    scn.close();// To Prevent scanner resource leak 
  
  }
  
}
