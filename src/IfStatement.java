package src;

import java.util.Scanner;

public class IfStatement {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		
		/*
		 * An if (or else) statement can contain one, and ONLY one
		 * statement in its body.
		 * 
		 * By using braces around multiple statements, those
		 * multiple statements become one block statement. 
		 */
		 
		 if (n % 2 == 0) {
			System.out.println("This number is even.");
			System.out.println("It is divisible by two.");
			System.out.println("Its square root of is " + Math.sqrt(n));
		 }
		 System.out.println("Thank you for your input!");
		 input.close();	
	}
}
