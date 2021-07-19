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

public class Creditcard {
    public static void main(String[] args) { 
        System.out.print("Enter credit card number: "); 
        Scanner input = new Scanner(System.in);
        long number = input.nextLong(); //use the .nextLong() method to read in the number as a long integer
        /*Your methods must treat the number as a numeric value throughout all the processing. 
        Do not convert the number to a string and use string methods to do the work.*/
        System.out.println("Your input: - " + number + " - is " + (isValid(number) ? "valid.\n" : "invalid.\n")); //ternary operator which determines whether user input is valid or invalid
        //call function isValid(number) 
        input.close();
    }

    /** Return true if the card number is valid but doesn't output on user end*/
    public static boolean isValid(long number) { /*card number length must be great/equal to 13 and less than/equal to 16
        and sum of double even place and double odd place is divisible by ten to be a valid number*/
        return (getSize(number) >= 13 && getSize(number) <= 16) && (prefixmatch(number, 4) //calls functions getSize(number), sumOfDoubleEvenPlace(number), and sumOfOddPlace(number)
         || prefixmatch(number, 5) || prefixmatch(number, 37) || prefixmatch(number, 6))
         && ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0);
    }

    /** Return the sum of the doubled even-place digits */
    public static int sumOfDoubleEvenPlace(long number) {
        int sum = 0;
        number /= 10; // get rid of odd rightmost digit
        while (number > 0) {
            sum += getDoubledDigit((int) (number % 10));
            number /= 10; // shift right two places
        }
        /*String num = number + "";
        for (int i = getSize(number) - 2; i >= 0; i -= 2) //calls getSize(number) in for loop
           sum += getDoubledDigit(Integer.parseInt(num.charAt(i) + "") * 2); //calls getDoubledDigit(int digit) and incrementally add to sum variable
        */
        return sum; //return sum variable to use in sumOfOddPlace(long number)
    }

    /** Multiply the given digit by two.
     *  If that result is a single digit, return it;
    *  otherwise return the sum of the two digits in the result */
    public static int getDoubledDigit(int digit) { /*The algorithm for determining whether a 
        card number is entered correctly as developed by Hans Luhn of IBM in 1954. The Luhn 
        check or Mod 10 check works as follows. Consider the card number 5842016792622547.*/
        //if(digit < 9) return digit;
        digit *= 2;
        return digit / 10 + digit % 10;
    }

    /** Return the sum of the odd-place digits */
    public static int sumOfOddPlace(long number) {
        int sum = 0;
        //String num = number + ""; don't convert to string value
        /*for (int i = getSize(number) - 1; i >= 0; i -= 2)
            sum += Integer.parseInt(num.charAt(i) + "");*/
        while (number > 0) {
            sum += (int) (number % 10);
            number /= 100;
        }
        return sum;
    }

    /** Return the number of digits in the given credit card number */
    public static int getSize(long number) { 
        //String num = digit + ""; don't convert to string value
        //return num.length();
        int count = 0;
        while (number > 0) {
            number /= 100;
            count++;
        }
        return count;
    }

       // Return true if the digit variable is a prefix for number
    public static boolean prefixmatch(long number, int digit) {
        return  getPrefix(number, getSize(digit)) == digit;
    }

    public static long getPrefix(long number, int digit) {
        /*if (getSize(number) > digit) {
           String num = number + "";
           return Long.parseLong(num.substring(0, digit));
        }*/
        int length = getSize(number);
        for (int i = 0; i < length - digit; i++) {
            number /= 10;
        }
        return number;
     }
}