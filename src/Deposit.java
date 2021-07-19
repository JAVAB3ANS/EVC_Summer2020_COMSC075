/*
 * Simulate bank deposit with holds for large deposits.
 *
 * Jason Vu - 6/17/20
 *
 * 1. Set starting account 
 * 2.
 * 3.
 * 4. Add amount to balance
 * 5. Print new balance
 */package src;
 
 import java.util.Scanner;
 
 public class Deposit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double balance = 100.0;
		System.out.print("Enter amount you wish to deposit: $");
		double amount = input.nextDouble();
		if (amount >= 0) {
			if(amount >= 10_000.00) {
				System.out.println("Your funds will be on fund for two days");
				System.out.println("Please wait for them to clear.");
			}
		balance += amount; //balance = balance + amount (augmented assignment)
		System.out.println("Your new balance is $" + balance);
		} else {
			System.out.println("You cannot deposit a negative amount.");
		}
		input.close();
	}
}
