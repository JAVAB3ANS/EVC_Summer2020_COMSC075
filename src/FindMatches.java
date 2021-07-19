package src;

import java.util.Scanner;

public class FindMatches {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter phrase: ");
		String phrase = input.nextLine();
		
		System.out.print("Enter the substring to search for: ");
		String toFind = input.nextLine();
		
		int position = phrase.indexOf(toFind); //start at zero
		if (position == -1) {
			System.out.printf("%s not in %s\n", toFind, phrase);
		} else {
			while (position != -1) {
				System.out.printf("Found at %d\n", position);
				position += toFind.length();
				position += phrase.indexOf(toFind, position);
 			}
		}
		input.close();
	}
}
