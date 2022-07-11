/*
 * Character Test
 * Jason Vu - 6/22/2020
 * Long description
 */package src;

import java.util.Scanner;

public class CharacterTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        System.out.print("Enter a character: ");
        String inputString = input.nextLine();
        char ch = inputString.charAt(0);
        
        if (ch >= 48 && ch <= 57) {
			System.out.println("This is a digit!");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println("This is an uppercase letter!");
		} else if (ch >= 97 && ch <= 122) {
			System.out.println("This is a lowercase letter!");
		} else {
			System.out.println("I cannot classify this1");
		}
        
        input.close();
    }
}
