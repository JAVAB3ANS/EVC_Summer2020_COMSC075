/*
 * Read the populations of the U.S. states
 * (plus Washington D.C. and Puerto Rico)
 * 
 * Find the minimum and maximum population
 * (and which states they are).
 * 
 * Calculate the average population.
 */

package src;

import java.util.Scanner;
import java.lang.NumberFormatException;
import java.io.FileNotFoundException;
import java.io.File;

public class PopulationUSASolved {
    public static void main(String[] args) {
        File censusFile = new File("./txt/states2019.csv");
        try {
            Scanner input = new Scanner(censusFile);
            int maxVal = -1;
            int nItems = 0;
            int sum = 0;
            int minVal = 99_999_999;
            String maxState = "";
            String minState = "";
            while (input.hasNext()) {
                String oneLine = input.nextLine();
                String[] info = oneLine.split(",");
                String state = info[0];
                int population = Integer.valueOf(info[1]);
                nItems++;
                sum += population;
                if (population > maxVal) {
                    maxVal = population;
                    maxState = state;
                }
                if (population < minVal) {
                    minVal = population;
                    minState = state;
                }
            }
            input.close();
            if (nItems > 0) {
                double avg = (double) sum / (double) nItems;
                System.out.format("Average population: %, .0f", avg);
                System.out.println();
                System.out.format("State with minimum population: %s (%,d)\n", maxState, maxVal);
                System.out.format("State with maximum population: %s (%,d)\n", minState, minVal);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file named 'states2019.csv'");
        } catch (NumberFormatException ex) {
            System.out.println(ex);
        }
    }
}