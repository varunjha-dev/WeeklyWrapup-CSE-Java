package g_break_continue;
public class b_break_pat {
  public static void main(String[] args) {
    int n = 4 ;
    for (int i = 1 ; i <= n ; i++){
      for (int j = 1 ; j <= n ; j++){
        System.out.print(j + " "); 
        if (j >= i ){
          break;
        }
      }
      System.out.println();
    }
  }
}
/*
 * "break" is used to exit from the current loop.
 * "return" statement is used to exit from the current function.
 * "continue" is used to skip the current iteration of a loop and continue with the next iteration
 */
