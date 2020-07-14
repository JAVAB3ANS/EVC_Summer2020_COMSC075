/*
 * Show how formatting works
 */package src;

import java.util.Scanner;

public class Formatting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your age in years: ");
        int years = input.nextInt();
        int days = years * 365;
        
        // System.out.println("Your age of " + years + " is about " + days + " days.");
        System.out.format("Your age of %d years is about %d days.\n", years, days); //close quote then put names of placeholders
        
        double result = 35.72 * 3.841 * 7.22386;
        
        // System.out.println("The multiplication result is " + result); //close quote then put names of placeholders
        System.out.format("The multiplication result is %.3f\n", result); //f stands for "floating point" or double
        // .3 tells how many decimal places I want
        
        input.close();
    }
}
