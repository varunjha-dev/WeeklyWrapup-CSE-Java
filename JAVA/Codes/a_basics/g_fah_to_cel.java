package a_basics;
import java.util.*;;
public class g_fah_to_cel {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int f = s.nextInt();
   // int cel = (5/9)*(f-32); wrong o/p as the 5/9 gives 0 as o/p
    int cel1 = (int)((5.0/9)*(f-32));// explict typecasting f  letting double value store it into int variable
    int cel2 = (5*(f-32))/9;
    System.out.println(cel1);
    System.out.println(cel2);
    s.close();
  }
  
}
