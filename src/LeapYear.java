/*
 * Determine Leap Year
 * Jason Vu - 6/18/2020
 * Find out if a user's input of a year
 * is a leap year or not and tell them
 */package src;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        System.out.print("Enter a year, or 0 to quit: ");
        int year = input.nextInt();
        
        while (year != 0) { // 0 is the sentinel value
			boolean isLeapYear = 
				((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
			
			//thus 1904 is a leap year, 1900 is not but 2000 is.
			
			if (isLeapYear) {
				System.out.format("%d is a leap year.\n", year);
			} else {
				System.out.format("%d is not a leap year.\n", year);
			}
			System.out.print("Enter another year, or 0 to quit: ");
			year = input.nextInt();
		}
		input.close();
    }
}
