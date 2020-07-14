/*
 * Likert Scale
 * Jason Vu - 6/18/2020
 * Rating from 1 to 5 - user input
 */package src;

import java.util.Scanner;

public class LikertScale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        System.out.print("Enter a rating from 1 to 5: ");
        int rating = input.nextInt();
        
        switch(rating) {
			case 1: System.out.println("Strongly Disagree");
					break;
			case 2: System.out.println("Disagree");
					break;
			case 3: System.out.println("Neutral");
					break;
			case 4: System.out.println("Agree");
					break;
			case 5: System.out.println("Strongly Agree");
					break;
			default: System.out.println("Invalid rating!");
		}
		System.out.println("Thank you for your input!");
        
        input.close();
    }
}
