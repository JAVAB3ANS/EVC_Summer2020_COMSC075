/*
 * Exercise Calculator
 *
 * Jason Vu - 6/17/20
 *
 */package src;
 
 import java.util.Scanner;
 
 public class Exercise {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter heart rate: ");
		int heartRate = input.nextInt();
		System.out.print("Enter age: ");
		int years = input.nextInt();
		int maxRate = 250 - years;
		double percent = (double) heartRate / (double) maxRate; //0... 1.0
		System.out.println("Your maximum heart rate is: " + (maxRate) + " bpm.");
		System.out.printf("Your percent of maximum is %.2f: " + percent + "%.");
		System.out.println("Your exercise today was: ");
		if(percent <= 60.0) {
			System.out.print("Very Light\n");
		} else if(percent <= 70.0) {
			System.out.print("Light\n");
		} else if(percent <= 80.0) {
			System.out.print("Moderate\n");
		} else if(percent <= 90.0) {
			System.out.print("Hard\n");
		} else {
			System.out.print("Maximum\n");
		} 
		input.close();
	}
}
