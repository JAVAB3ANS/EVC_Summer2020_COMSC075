package src;
 
 import java.util.Scanner;
 
 public class NoVowels {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		
		//Look very carefully at how the "for" statement is structured
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				System.out.printf("%c is a vowel\n", ch);
			} else {
				System.out.printf("%c is not a vowel\n", ch);
			}
		}		
		input.close();
	}
 }
