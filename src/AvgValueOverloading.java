package src;

/*
 * Average Value Overloading
 * Jason Vu - 6/25/2020
 * 
 */

public class AvgValueOverloading {
	public static final double MAX_DISCOUNT = 37.5;
	
	public static void main(String[] args) {
		//System.out.println("Global value is " + globalValue);
		
		double result1 = average(3, 5);
		System.out.printf("Average of 3 and 5 is %.2f", result1);
		separator(15);
		double result2 = average(3.7, 8.5);
		System.out.printf("Average of 3.7 and 8.5 is %.2f", result2);
		separator(20);
		double result3 = average(3.5, 7.9, 2.6);
		System.out.printf("Average of 3.5, 7.9, and 2.6 is %.3f", result3);
		separator(25);
	}
	
	public static void separator(int n) {
		for (int i = 0; i < n; i++) {
			System.out.print("-");
		}
		System.out.println();
		return; // this is optional for void methods
	}
	
	public static double average(int a, int b) {
		//System.out.println("Inside average, the global value is " + globalValue);
		double result = (a + b) / 2.0;
		return result;
	}
	
	public static double average(double a, double b) {
		double result = (a * b) / 2.0;
		return result;
	}
	
	public static double average(double a, double b, double c) {
		double result = (a + b + c) / 3.0;
		return result;
	}	
}

