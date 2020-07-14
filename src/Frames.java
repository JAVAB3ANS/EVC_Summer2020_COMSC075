/*
 * Frames - Write a program named Frames.java that will ask for the 
 * length and width of a picture frame (both integers). The program 
 * will then display: the area of the frame in square centimeters
 * the frame size (small, medium, or large) the total price for the 
 * package of 12. If the area is zero or negative, print an appropriate 
 * error message. If the area of the frame is greater than 850 square 
 * centimeters, print the area along with a message telling the user 
 * that you cannot make a frame that large.

 *Your program must use a variable to hold the price of a single frame 
 * and do a calculation to find the total price.

 * Display the total price with exactly two 
 * digits to the right of the decimal point. 
 * Jason Vu
 * 6/29/20
 * 
 */package src;
 
import java.util.Scanner;

public class Frames {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the length of the frame in cm: ");
		int frame_length = input.nextInt();
		
		System.out.print("Enter the width of the frame in cm: ");
		int frame_width = input.nextInt();
		
		int frame_area = frame_length * frame_width;
		double frame_cost;
		
		String area = "Your frame is " + frame_area + " square centimeters.";
		
		if (frame_length <= 0 || frame_width <= 0) { 
			System.out.print("The length times width must be greater than zero.\n");
		} else {
			if (frame_area < 250) {
				frame_cost = 15.00 * 12;
				System.out.println(area + "This is a small frame.");
				System.out.format("The total cost for 12 frames is $%.2f\n", frame_cost);
			} else if (frame_area >= 250 && frame_area < 600) {
				frame_cost = 23.50 * 12;
				System.out.println(area + "This is a medium frame.");
				System.out.format("The total cost for 12 frames is $%.2f\n", frame_cost);
			} else if (frame_area >= 600 && frame_area < 850) {
				frame_cost = 30.75 * 12;
				System.out.println(area + "\nThis is a large frame.");
				System.out.format("The total cost for 12 frames is $%.2f\n", frame_cost);
			} else {
				System.out.println(area + "\nSorry, we cannot make frames that large.\n");
			}
			input.close();
		}
		
	}
}
