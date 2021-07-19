package src;

import java.util.Scanner;
import java.util.Arrays; //note the "s" at the end!

public class SortingExample {
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            //find the minimum in the list[i..list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;
            System.out.printf("Index is %d, currentMin is %f at index %d\n", i, currentMin, currentMinIndex);

            for (int j = i + 1; j < list.length; j++) {
                System.out.printf("Comparing against position %d\n", j);
                if (currentMin > list[j]) {
                    System.out.printf("Found new minimum %f at index %d\n", list[j], j);

                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //Swap list[i] with list[currentMinIndex] if necessary;
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = {3.7, 12.2 , 41.6, 19.9, 2.1};
        //display data before sort...
        System.out.println("Before: " + Arrays.toString(data));

        selectionSort(data);

        //display data after sort...
        System.out.println("After: " + Arrays.toString(data));

        input.close();
    }
}