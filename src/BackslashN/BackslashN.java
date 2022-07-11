package src;

/*
 * BackSlash \n
 * Jason Vu - 6/18/2020
 * Long description
 */

import java.util.Scanner;

public class BackslashN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double price = 39.95;
        // try taking out the \n to see the difference...
        
        System.out.format("Your total cost is %.2f before tax.\n", price);
        System.out.println("Thank you for shopping at Costco.");
        
        input.close();
    }
}
