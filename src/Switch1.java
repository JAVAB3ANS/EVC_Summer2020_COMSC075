/*
 * Switch statement using numeric index
 * Jason Vu - 6/18/2020
 * Generate random number from 1-5
 * And give its playing card name:
 * 1 = Ace, 2 = Deuce, 3 = Trey, 4 = Boat, 5 = Nickel
 */package src;

import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        // generates number from 1-5
        // have to do to 5 to reach last number 
        int num = 1 + (int) (5 * Math.random());
        String cardName = ""; //get entire input up to "ENTER" key

        switch(num) {
			case 1: cardName = "Ace"; break;
			case 2: cardName="Deuce"; break;
			case 3: cardName="Trey"; break;
			case 4: cardName="Boat"; break;
			case 5: cardName="Nickel"; break;
			default: cardName="Unknown!"; break;
			//just in case something goes wrong (e.g. not from 1-5 index)
		}
		
		System.out.println("Your card number is: " + num);
		
		if (cardName == "Unknown!") {
			System.out.println("Nice input, but nothing fulfilled the condition!");
		} else {
			System.out.println("Your card name is: " + cardName);
		}
        input.close();
    }
}
