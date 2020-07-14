/*
 * Jason Vu - 6/24/2020
 * Repeatedly read a string from the keyboard and determine
 * whether it is a palindrome (same backward as forwarad)
 * or not.
 * 
 * Examples of palindromes: peep, noon, racecar, redivider
 */package src;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string, or press ENTER to quit: ");
        String s = input.nextLine().trim();
        
        while (!s.equals("")) {
            // The index of the first character in the string
            int low = 0;

            // The index of the last character in the string
            int high = s.length() - 1;

            boolean isPalindrome = true;
            while (low < high) { // fall out of loop when they meet or cross over
              if (s.charAt(low) != s.charAt(high)) {
                isPalindrome = false;
                break; // break on mismatch
              }
              low++;
              high--;
            }

            if (isPalindrome) {
              System.out.println(s + " is a palindrome");
            } else {
              System.out.println(s + " is not a palindrome");
            }
          
            System.out.print("Enter next string, or ENTER to quit: ");
            s = input.nextLine();
        }
        input.close();
    }
    
}
