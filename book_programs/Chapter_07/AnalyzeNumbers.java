// Name
// AnalyzeNumbers
// Prompt user to input elements in an array. Calculate the average. Find
// the number of items greater than the average.
package book_programs.Chapter_7;

import java.util.Scanner;

public class AnalyzeNumbers {
  public static void main(String[] args) {
	// final int NUM_ITEMS = 10;

	// Create a Scanner object
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of items: ");
    int n = input.nextInt();

    // Create array to hold items
    double[] numbers = new double[n];

    double sum = 0;

    System.out.print("Enter the numbers: ");
    for (int i = 0; i < n; ++i) {
	  numbers[i] = input.nextDouble();
	  sum += numbers[i];
    }

    // Calculate the average;
    double average = sum / n;

    // Determine the number of elements greater than the average
    int count = 0;
    for (int i = 0; i < n; i++)
      if (numbers[i] > average)
        count++;

    System.out.println("Average is " + average);
    System.out.println("Number of elememts above the average is " + count);

    input.close();
  }

}