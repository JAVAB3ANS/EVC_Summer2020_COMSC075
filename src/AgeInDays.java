package src;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean valid = false;
        int years = 0;
        while(!valid) {
            System.out.print("How many years old are you?");
            try {
                years = input.nextInt();
                if ( years > 0) {
                    valid = true; 
                } else {
                    System.out.println("Age must be greater than zero!");
                }
            } catch (InputMismatchException ex) {
                input.nextLine(); //clear out extraneous input
                System.out.println("Please use only digits.");
            }
        }
        input.close();
    }
}