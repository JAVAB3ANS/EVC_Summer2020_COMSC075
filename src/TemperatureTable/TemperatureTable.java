/*
 * Table of Fahrenheit -> Celsius
 * Display table showing temperature in degrees C
 * for Fahrenheit temperatures from 0 to 100.
 * in 10-degree steps
 * Use for loop to do this.
 */
package src;
 public class TemperatureTable2 {
	public static void main(String[] args) {
		System.out.print("\u00b0F	\u00b0C");
		//for loop goes here
		for (int fahrenheit = 0; fahrenheit <= 100; fahrenheit += 10) {
			double celsius = (fahrenheit - 32) / 9.0 * 	5.0;
			System.out.printf("%3d	%5d\n", fahrenheit, celsius);
		}
	}
 }
