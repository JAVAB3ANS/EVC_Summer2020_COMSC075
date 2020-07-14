package src;

import java.util.Scanner;

public class NestedLoops3b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter number from 1-9, or 0 to quit: ");
		int n = input.nextInt();

		while ( n != 0) {
			for (int row = 1; row <= n; row++) {
				for (int column = 1; column <= row; column++) {
					System.out.print(column + " ");
				}
				System.out.println();//go to new line after printing all the columns
			}
			System.out.println();//for readability
			System.out.print("Enter number from 1-9, or 0 to quit: ");
			n = input.nextInt();
		}
		input.close();
	}
}
