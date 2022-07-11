/*
 * Statistics
 * Jason Vu - 6/30/20
 *
 * Write a program named Statistics.java that repeatedly asks a user 
 * to enter a price of an item or -1 when finished. When the user enters 
 * -1, your program will compute and display the total number of items, 
 * the average price, and the standard deviation of the prices. 
 */package src;
 
import java.util.Scanner;

public class Statistics2 {
	public static void main(String[] args) {
		int itemNumber; //initialized variable
		float mean, standardDev; //initialized mean and standard deviation variables
		Scanner num=new Scanner(System.in);
		System.out.print("[Welcome, enter amount of item prices or -1 to quit:] "); //first user prompt
		itemNumber=num.nextInt(); //user input
		int len=String.valueOf(itemNumber).length(); //gets character of user input
		
		if (itemNumber <= 1) { //only triggers when there are is at least one input or less
			mean = (itemNumber += itemNumber) / 2;
			System.out.println("The average is: " + mean);
			System.out.println("Number of items: " + len);
			System.out.println("Cannot calculate standard deviation for one or fewer items.\n");
		} else if (itemNumber == -1) { //if itemNumber is negative one, set length to 0 and output no calculation
			System.out.println("Number of items: " + 0); //output number which is 0
			System.out.println("No data entered. Cannot calculate statistics.\n"); 
		} else if (itemNumber > 1) {
			//declare an array of n size to store integral data points
			int[] dataset = new int[itemNumber]; //initialized new array called dataset
			//allow user inputs
			int i = 0;
			for (i = 0; i < itemNumber; i++) { //enters new input for ever amount entered in itemNumber variable
				System.out.print("Enter price of item " + "[" + i + "] ");
				dataset[i] = num.nextInt();
				//calculate the mean, which is variable "mean"
			}
			int sum = 0; //initialize sum and j variables
			int j = 0;
			while (j < itemNumber) { //while variable j is less than itemNumber (number inputs)
				sum += dataset[j]; //sum will incrementally add to dataset[j] until j < itemNumber
				j++;
			}
			mean = (float)sum / itemNumber;
			
			//calculate standard deviation which is variable "standardDev"
			/*Work out the Mean (the simple average of the numbers)
			Then for each number: subtract the Mean and square the result.
			Then work out the mean of those squared differences.
			Take the square root of that and we are done!*/
			
			float temp = 0.0f;

			for (j = 0; j < itemNumber; j++) { /*loop through all itemNumber values in dataset[j] 
				subtract the mean from each value and square the result each time*/
				temp = temp + (float)Math.pow(dataset[j] - mean, 2);
			}

			standardDev = (float)Math.sqrt(temp / (itemNumber - 1));
			System.out.printf("Average is: $%.2f\n", mean);
			System.out.printf("Standard deviation of prices is: $%.2f\n", standardDev);
	
		}
		num.close();
	}
}
