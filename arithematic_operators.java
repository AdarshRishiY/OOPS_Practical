package CSE; 

import java.util.Scanner; 

public class arithematic_operators { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		
		int a, b;
		System.out.print("Enter the first integer (a): ");
		a = input.nextInt(); 
		System.out.print("Enter the second integer (b): ");
		b = input.nextInt(); 
		System.out.println("--- Arithmetic Operations ---");
		System.out.println("a + b = " + (a + b));     
		System.out.println("a - b = " + (a - b));   
		System.out.println("a * b = " + (a * b));   
		System.out.println("a / b = " + (a / b));     
		System.out.println("a % b = " + (a % b));    
		input.close();
	}
}
