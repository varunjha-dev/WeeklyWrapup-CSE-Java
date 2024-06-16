package b_conditionals;

import java.util.Scanner;

public class e_total_salary {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int basic = s.nextInt();
    char grade = s.next().charAt(0);
    double hra = 0.2*basic;
    double da = 0.5*basic;
    int allow;
    if (grade == 'A' || grade == 'a') {
      allow = 1700;
    }
    else if (grade == 'B' || grade == 'b') {
      allow = 1500;
    }
    else {
      allow = 1300;
    }
    double pf = 0.11*basic;
    double total_salary = basic+hra+da+allow-pf; 
    total_salary = (int)(Math.round(total_salary));
    System.out.println("Rounded off total salary of a person: "+ total_salary);
    s.close();
  }
}
