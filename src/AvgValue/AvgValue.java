package src;

/*
 * Average Value
 * Jason Vu - 6/25/2020
 * 
 */

import java.util.Scanner;

public class AvgValue {
	public static final double MAX_DISCOUNT = 37.5;
	
	public static void main(String[] args) {
		//System.out.println("Global value is " + globalValue);
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first = input.nextInt();
		 
		System.out.print("Enter second number: ");
		int second = input.nextInt();
		
		double avg = average(first, second);
		System.out.format("The average of %d and %d %.1f.\n",
			first, second, avg);
		System.out.format("The geometric mean of %d and %d is %.3f.\n",
			first, second, geometricMean(first, second));
			
		separator(15);
		
		System.out.format("The harmonic mean of %d and %d is %.3f.\n",
			first, second, harmonicMean(first, second));
			
		separator(20);
		input.close();
	}
	
	public static double reciprocal(double n) {
		return 1.0 / n;
	}
	
	public static void separator(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
		return; // this is optional for void methods
	}
	
	public static double average(double a, double b) {
		//System.out.println("Inside average, the global value is " + globalValue);
		double result = (a + b) / 2.0;
		return result;
	}
	
	public static double geometricMean(double a, double b) {
		double result = Math.sqrt(a * b);
		return result;
	}
	
	public static double harmonicMean(double a, double b) {
		double result = reciprocal(average(reciprocal(a), reciprocal(b)));
		return result;
	}	
}
