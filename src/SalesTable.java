package src;

import java.util.Scanner;

public class SalesTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] sales = {
            {10, 11, 12, 13},
            {14, 15, 16, 17},
            {18, 19, 20, 21}
        };

        double grandTotal = 0.0;
        double yearlyTotal = 0.0;
        double quarterlyTotal = 0.0;
        final int BASE_YEAR = 2016;

        for (int row = 0; row < sales.length; row++) {
            yearlyTotal = 0.0; //start new yearly total for each row
            for (int col = 0; col < sales[row].length; col++) {
                grandTotal += sales[row][col];
                yearlyTotal += sales[row][col];
            }
            System.out.printf("Total for year %d is %.1f\n", BASE_YEAR + row, yearlyTotal);
        }
        
        for (int col = 0; col < sales[0].length; col++) {
            quarterlyTotal = 0.0;
            for (int row = 0; row < sales.length; row++) {
                quarterlyTotal += sales[row][col];
            }
            System.out.printf("Total for Q%d is %.1f\n", col + 1, quarterlyTotal);
        }
        System.out.printf("Grand total is %.1f\n", grandTotal);
        input.close();
    }
}