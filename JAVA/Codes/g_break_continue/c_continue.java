package g_break_continue;
public class c_continue {
  public static void main(String[] args) {
    // break 
    System.out.println("break Keyword");
    for (int i = 1; i<=10; i++ ){
      if (i==5) {
        break;
      }
      System.out.println(i);
    }
    // continue
    System.out.println("Continue keyword for loop");
    for (int i = 1; i<=10; i++ ){
      if (i==5) {
        continue;
      }
      System.out.println(i);
    }
    System.out.println("Continue keyword While loop");
    int j = 1;
    while (j<= 10) {
      if (j == 5) {
        j++; // to ensure we are only skipping current iteration not incrementing of no.
        continue;
      }
      System.out.println(j);
      j++;
    }
  }
}
