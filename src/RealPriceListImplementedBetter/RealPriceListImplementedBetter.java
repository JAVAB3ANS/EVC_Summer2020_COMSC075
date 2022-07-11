/* 
 * Read a list of prices, total them,
 * Add 5% sales tax, and print the results.
 */

package src;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class RealPriceListImplementedBetter {
    public static void main(String[] args) {
        final double TAX_RATE = 0.05;
        double subTotal = 0.0;
        int nItems = 0;

        //create a File from file prices.txt
        File priceFile = new File("./text_files/priceFile.txt");
        /* Instead of using if (priceFile.exists()), I'm using
         * the FileNotFoundException because that's a checked
         * exception, and I *have* to put it in there anyway.
         */
        //Create Scanner to read from file
        try {
            Scanner priceInput = new Scanner(priceFile);
            while (priceInput.hasNext()) { //hasNext() returns true if more input is available
                String data = priceInput.nextLine();
                double price = Double.valueOf(data); //convert string to double
                //System.out.printf("Read price $%.2f\n", price);
                subTotal += price;
                nItems++;
            }
            //close Scanner

            //calculate and print summary information
            double tax = subTotal * TAX_RATE;
            System.out.printf("Number of items: %d\n", nItems);
            System.out.printf("Subtotal: $%7.2f\n", subTotal);
            System.out.printf("Tax: $%7.2f\n", tax);
            System.out.printf("Total: $%7.2f\n", subTotal + tax);

            priceInput.close();
        }
        catch (NumberFormatException ex) {
            System.out.println("Bad data in file...");
            System.out.println(ex.getMessage());
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Exception says: Could not open prices.txt");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Unexpected error!");
            System.out.println(ex.getMessage());
        }
    }
}