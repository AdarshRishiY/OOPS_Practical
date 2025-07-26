package CSE;

public class Logical_Operators {

  public static void main(String[] args) {

    int a = 5;
    int b = 3;
    int c = 8;
    System.out.println("(a > b) && (c > b): " + ((a > b) && (c > b)));
    System.out.println("(a > b) && (c < b): " + ((a > b) && (c < b)));
    System.out.println("(a < b) || (c > b): " + ((a < b) || (c > b)));
    System.out.println("(a > b) || (c < b): " + ((a > b) || (c < b)));
    System.out.println("(a < b) || (c < b): " + ((a < b) || (c < b))); 
    System.out.println("!(a == b): " + (!(a == b)));
    System.out.println("!(a > b): " + (!(a > b)));
}
}
