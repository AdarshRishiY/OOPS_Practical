package CSE;

import java.util.Scanner;

public class Ternary_Operator {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int februaryDays;
    String result;

    System.out.print("Enter the number of days in February: ");
    februaryDays = input.nextInt();

    input.close();

    result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
    System.out.println(result);
  }
}