/*
 * Simulate roll of two dice.
 * Jason Vu - 6/18/20
 * Generate two random integers in range 1-6 (inclusive)
 * and give the total
 */package src;
 
 public class Dice {
	public static void main(String[] args) {
		int die1 = 1 + (int) (6 * Math.random());
		int die2 = 1 + (int) (6 * Math.random());
		System.out.println("***********");
		System.out.println("The results:");
		System.out.println("Die 1: " + die1);
		System.out.println("Die 2: " + die2);
		System.out.println("***********");
	}
}
