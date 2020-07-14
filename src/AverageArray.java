package src;

public class AverageArray {
	public static double averageArray(int[] list) {
		int sum = 0;
		for (int listItem: list) {
			sum += listItem;
		}
		double average = (double) sum / (double) list.length;
		return average;
	}
	
	//create void method called displayArray that takes an array
	//and prints all the items in it one line
	// (or, if you want a challenge, five items per line)
	
	public static void main(String[] args) {
		int[] items = {6, 10, 11, 4};
		double avg = averageArray(items);
		
		System.out.printf("The average of your items is %.3f\n", avg);
	}
}
