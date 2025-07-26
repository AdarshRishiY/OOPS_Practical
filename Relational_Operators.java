package CSE;

import java.util.Scanner;

public class Relational_Operators {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a, b;

    System.out.print("Enter the first integer (a): ");
    a = input.nextInt();

    System.out.print("Enter the second integer (b): ");
    b = input.nextInt();

    input.close();

    System.out.println("a is " + a + " and b is " + b);

    System.out.println("a == b: " + (a == b));

    System.out.println("a != b: " + (a != b));

    System.out.println("a > b: " + (a > b));

    System.out.println("a < b: " + (a < b));

    System.out.println("a >= b: " + (a >= b));

    System.out.println("a <= b: " + (a <= b));
  }
}
