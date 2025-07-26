
package CSE; 

import java.util.Scanner; 

public class Increment_and_Decrement_Operators { 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		int a, b;
		int result1, result2;
		
		System.out.print("Enter an integer for increment operation (a): ");
		a = input.nextInt(); 
		
		System.out.println("Original value of a: " + a);
		
		result1 = ++a; 
		System.out.println("After pre-increment (++a): " + result1); 
		System.out.println("Current value of a: " + a);
		
		System.out.println(); 
		System.out.print("Enter an integer for decrement operation (b): ");
		b = input.nextInt(); 
		
		System.out.println("Original value of b: " + b);
		
		result2 = --b; 
		System.out.println("After pre-decrement (--b): " + result2); 
		System.out.println("Current value of b: " + b);
		input.close();
	}
}
