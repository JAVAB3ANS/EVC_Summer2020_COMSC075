/* Jason Vu
 * 7/6/2020
 * Validating Credit Card Numbers
 * Description: Write a program named Creditcard.java that 
 * prompts the user for a credit card number and determines 
 * whether it is valid or not.
 * Credit card numbers follow certain patterns. A credit card number 
 * must have between 13 and 16 digits, and must start with:
 * - 4 for Visa cards
 * - 5 for Master cards
 * - 6 for Discover cards
 * - 37 for American Express cards
 */package src;

import java.util.Scanner;

public class CreditcardRevised {
    public static void main(String[] args) { 
        System.out.print("Enter credit card number: "); 
        Scanner input = new Scanner(System.in);
        long number = input.nextLong(); //use the .nextLong() method to read in the number as a long integer
        
        System.out.println("Your input: - " + number + " - is " +
            (isValid(number) ? "valid.\n" : "invalid.\n")); //ternary operator which uses result of whether user input is valid or invalid
         
        input.close();
    }

    /** Return true if the card number is valid but doesn't output on user end*/
    public static boolean isValid(long number) {
        /*card number length must be great/equal to 13 and less than/equal to 16
        and sum of double even place and double odd place is divisible by ten to be a valid number
        and prefix must be one of 37, 4, 5, or 6 */
        
        int firstDigit = (int) getPrefix(number, 1);
        int firstTwoDigits = (int) getPrefix(number, 2);
        
        return (getSize(number) >= 13 && getSize(number) <= 16) 
            && (firstDigit == 4 || firstDigit == 5 || firstDigit == 6 || firstTwoDigits == 37)
            && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    /** Return the sum of the doubled even-place digits */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        number /= 10; // get rid of "odd" rightmost digit
        
        while (number > 0) {
            sum += getDoubledDigit((int) (number % 10));
            number /= 100; // shift right two places
        }
        return sum;
    }

    /** Multiply the given digit by two.
     *  If that result is a single digit, return it;
    *  otherwise return the sum of the two digits in the result */
    public static int getDoubledDigit(int digit) {
        digit *= 2;
        return digit / 10 + digit % 10;
    }

    /** Return the sum of the odd-place digits */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        while (number > 0) {
            sum += (int) (number % 10);
            number /= 100;
        }
        return sum;
    }

    /** Return the number of digits in the given credit card number */
    public static int getSize(long number) { 
        int count = 0;
        while (number > 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
    /** Return leading k digits from number */
    public static long getPrefix(long number, int k) {
        int length = getSize(number);
        for (int i = 0; i < length - k; i++) {
            number /= 10;
        }
        return number;
    }
}
