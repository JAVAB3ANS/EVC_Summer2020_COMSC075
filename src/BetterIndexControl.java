package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BetterIndexControl {
    public static void main(String[] args) {
        String[] words = {"ant", "bee", "cat", "dog", "elk", "fox"};

        Scanner input = new Scanner(System.in);
        try {
            System.out.print("Enter an index: ");
            int index = input.nextInt();
            if (index >= 0 && index < words.length) {
                String result = words[index];
                System.out.println("The word is " + result + ".");
            } else {
                System.out.println("Please use a number from 0 to " + (words.length - 1));
            }
        } catch (InputMismatchException ex) {
            System.out.println("Please use digits only.");
        }
        input.close();
    }
}