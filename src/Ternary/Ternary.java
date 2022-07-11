/*
 * Show the ternary operator
 * Jason Vu - 6/18/2020
 * Long description
 */package src;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        
		/*
        double price = 0.0;

        if (age < 16 || age > 65) {
			price = 4.95;
		} else {
			price = 7.95;
		}
		*/
		//example of ternary operator!
		double price = (age < 16 || age > 65)? 4.95 : 7.95; //same as lines 18-23
		
		System.out.format("That will cost $%.2f.\n", price);
		
		input.close();
    }
}
