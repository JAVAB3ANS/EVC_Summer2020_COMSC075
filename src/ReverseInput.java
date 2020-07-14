package src;

import java.util.Scanner;

public class ReverseInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] data = new int[5];
		
		for (int i = 0; i < data.length; i++) {
			System.out.printf("Enter integer #%d: ", (i + 1));
			data[i] = input.nextInt();
		}
		
		//now run the reverse loop for output
		System.out.print("In reverse order, your numbers are ");
		for (int i = data.length - 1; i >= 0; i--) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		input.close();
	}
}
