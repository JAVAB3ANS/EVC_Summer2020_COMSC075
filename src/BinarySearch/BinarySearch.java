/*
 * Binary search
 * Jason Vu, 1 Jul 2020
 * Write a program that prompts for an integer and sees if it exists
 * in an array.
 */package src;

import java.util.Scanner;

public class BinarySearch {
    
    // this is the method shown in the book, adapted to Strings
    public static int binarySearch(String[] list, String lookFor) {
        int low = 0;
        int high = list.length - 1;
        int mid = (low + high) / 2; // doing this here to allow debug code
        
        while (high >= low) {
            mid = (high + low) / 2;
            if (lookFor.compareTo(list[mid]) < 0) { // lookFor < list[mid]
                high = mid - 1;
            } else if (lookFor.compareTo(list[mid]) > 0) { // lookFor > list[mid]
                low = mid + 1;
            } else { // must be equal
                return mid;
            }
        }
        /*
         * Instead of returning -1, we can return the position
         * where it ought to go. We can't return -low because what about
         * something that ought to go at location zero? (0 and -0 are 
         * the same). Instead, I'll take the low position, make it negative,
         * and then subtract 1.
         */
        // test if -mid - 1 works. Answer: nope.
        // System.out.printf("-low - 1 -> %d, -mid - 1 -> %d\n", (-low - 1),
        //    (-mid - 1)); // debugging
        return (-low - 1);
            
    }
    
    public static void main(String[] args) {
        
        String[] countries = {"AT", "AU", "DE", "ES", "FR", "HU", "IS",
            "JP", "KR", "PT", "TW", "US"};
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a country to look for, or ENTER to end: ");
        String lookFor = input.nextLine().trim().toUpperCase();
        
        while (!lookFor.equals("")) { // empty string is my sentinel value
            int foundAt = binarySearch(countries, lookFor);
            if (foundAt >= 0) { // tells whether I found it (>=0) or not (-1)
                System.out.printf("We found it at index number %d\n", foundAt);
            } else {
                System.out.printf("Not found; it would go at position %d.\n",
                    (-(foundAt + 1)));
            }
            System.out.print("Enter next country to look for, or ENTER to end: ");
            lookFor = input.nextLine().trim().toUpperCase();
        }
        
        input.close();
    }
}
