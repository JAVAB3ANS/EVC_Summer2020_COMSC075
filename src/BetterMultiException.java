package src;

import java.util.Scanner;
import java.util.InputMismatchException;

public class BetterMultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dividing numbers");

        try {
            System.out.print("Enter the dividend: ");
            int dividend = input.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = input.nextInt();

            if(divisor != 0) {
                System.out.printf("Quotient: %d\n", dividend / divisor);
                System.out.printf("Remainder: %d\n", dividend % divisor);
            } else {
                System.out.println("Sorry, you cannot divide by zero!");
            }
        } catch (InputMismatchException ex) {
            System.out.println("Please use only digits!");
        }
        input.close();
    }
}