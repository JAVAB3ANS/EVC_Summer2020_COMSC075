package src;

/*
 * Calculate approximate age in days.
 * Jason Vu - June 16, 2020
 *
 * 1. Put up prompt for user to input age.
 * 2. Get the age in years from the keyboard.
 * 3. Calculate days as years * 365.
 * 4. Display the result properly labeled.
 */
 
 import java.util.Scanner; //bring this class into our program
 
 public class AgeWithInput {
	public static void main(String[] args) {
		System.out.print("Enter your age in years:");
		
		Scanner input = new Scanner(System.in);
		int years = input.nextInt();
		int days = years * 365; //ignoring leap years here
		
		System.out.print("Your age in days is about " + days + ".");
		
		System.out.print("Your birth year is about ");
		System.out.print(2020 - years); 
		
		input.close();
	}
}
