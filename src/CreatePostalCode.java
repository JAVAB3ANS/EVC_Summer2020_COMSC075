/*
 * Create Postal Code
 * Jason Vu - 6/23/2020
 * Long description
 */package src;


public class CreatePostalCode {
	public static void main(String[] args) {
		char letter1 = (char)('A'+ (int) (Math.random() * 26));
		char digit1 = (char) ('0' + (int) (Math.random() * 9));
		char letter2 = (char) ('A' + (int) (Math.random() * 26));
		char digit2 = (char) ('A' + (int) (Math.random() * 9));
		char letter3 = (char) ('A' + (int) (Math.random() * 26));
		char digit3 = (char) ('A' + (int) (Math.random() * 9));
		
		System.out.format("Your random Canadian postal code is %c%c%c %c%c%c. \n",
			letter1, digit1, letter2, digit2, letter3, digit3);
	}
}
			
