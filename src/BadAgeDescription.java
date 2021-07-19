/*
 * Tell people what they can do at various ages.
 * Jason Vu (6/17/2020)
 * Ask user for name
 * if < 18, then tell them they cannot vote, drink, or retire
 * if < 21, then tell them they can vote, but not drink or retire
 * if < 65, then tell them they can vote and drink, but not retire
 * otherwise, they can vote, drink, and retire
*/package src;

import java.util.Scanner;

public class BadAgeDescription {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = input.nextInt();
		
		if (age < 0) {
			System.out.print("Negative ages don't sound right to me.");
		} else if (age < 18) {
			System.out.print("You can't vote, drink, or retire.");
		} else if (age < 21) {
			System.out.print("You can vote, but neither drink nor retire.");
		} else if (age < 65) {
			System.out.print("You can vote or drink, but you're not ready for retirement yet.");
		} else {
			System.out.print("You can vote, drink, and retire.");
		}
		input.close();
	}
	
}
