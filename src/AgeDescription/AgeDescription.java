package src;

/*
 * Tell people what they can do at various ages.
 * Jason Vu (6/17/2020)
 * Ask user for name
 * if < 18, then tell them they cannot vote, drink, or retire
 * if < 21, then tell them they can vote, but not drink or retire
 * if < 65, then tell them they can vote and drink, but not retire
 * otherwise, they can vote, drink, and retire
*/

import java.util.Scanner;

public class AgeDescription {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if (age < 0) {
			System.out.println("Negative ages don't sound right to me.");
		} 
		if (age < 18) {
			System.out.println("You can't vote, drink, or retire.");
		} 
		if (age < 21) {
			System.out.println("You can vote, but neither drink nor retire.");
		}
		if (age < 65) {
			System.out.println("You can vote or drink, but you're not ready for retirement yet.");
		} else {
			System.out.println("You can vote, drink, and retire.");
		}
		input.close();
	}
}
