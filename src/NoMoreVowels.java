package src;

import java.util.Scanner;

public class NoMoreVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a phrase: ");
		String phrase  = input.nextLine();
		String newPhrase = "";
		
		for (int i = 0; i < phrase.length(); i++) {
			char ch = phrase.charAt(i);
			if (ch != 'a' && ch != 'o' && ch != 'i' && ch != 'o' && 
				ch != 'u') {
				newPhrase += ch; //add it to the new phrase
			} else {
				//skip it; it was a vowel.
			}
		}
		System.out.println("Yr nw phrs s: " + newPhrase);
		input.close();
	}
}
