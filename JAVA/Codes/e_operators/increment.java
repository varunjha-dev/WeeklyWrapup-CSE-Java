public class increment {
  public static void main(String[] args) {
    int a = 10;
    a++; // post Increment 
    System.out.println(a); //a= 11
    ++a; // pre Increment
    System.out.println(a++); // a= 12
    System.out.println(a); // a= 13 as a is post incremented in above 

    int b = a++; // a = 13 also b = 13, This means that increment a after this line of use
    System.out.println(b); // b= 13 no increment as b has Post increment in a 
    // but 
    int c = ++b; // this means that it ensures increment in this line itself  only   
    System.out.println(c); //as b is preincremented 
    //short hand operators 
    a=4;
    a*=2;
    System.out.println(a);
    a^=2;
    System.out.println(a);
    a=2+3^2;// here comes operator precedency and associativity table 
    System.out.println(a);
    a= 2+(3^2);
    System.out.println(a); // but no need to learn as we use brackets for better reusibility
  }
}
