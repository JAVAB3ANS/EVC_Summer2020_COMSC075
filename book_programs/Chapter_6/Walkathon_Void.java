package book_programs.Chapter_6;

/*
 * Name
 * Walkathon
 * This program prompts the user for the number of laps walked and
 * prints the color of the ribbon.
 */

import java.util.Scanner;

public class Walkathon_Void {

  // This method accepts as a parameter the number of laps walked and displays
  // the color of the ribon.
  public static void color_prize(int num_laps) {

	 String ribbon_color;

	//Determine the ribbon color
	if (num_laps >= 50)
	  ribbon_color = "gold";
	else if (num_laps >= 40)
	  ribbon_color = "silver";
	else if (num_laps >= 25)
	  ribbon_color = "bronze";
	else
	  ribbon_color = "blue";

	System.out.println("You earned a " + ribbon_color + " ribbon.");
  }


  //  Prompt user for number of laps walked. Validate that the laps walked
  // is nonnegative. Display the color of the ribbon.
  public static void main(String[] args) {
	// Create scanner object
	Scanner input = new Scanner(System.in);

	// Prompt user for the number of laps walked
	System.out.print("Enter the number of laps walked: ");

	int laps = input.nextInt();

	// Validate that the number of laps is nonnegative
	while (laps < 0) {
	  System.out.println("The number of laps must be nonnegative. " +
	                     "Enter the number of laps again: ");
	  laps = input.nextInt();
    }

    // Determine and print the color of the ribbon
	color_prize(laps);
	
	input.close();

  }

}