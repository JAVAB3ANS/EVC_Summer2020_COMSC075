package src;

import java.util.Scanner;
import java.util.InputMismatchException;

public class GeneralException {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Dividing number: ");

        try {
            System.out.print("Enter the dividend: ");
            int dividend = input.nextInt();

            System.out.print("Enter the divisor: ");
            int divisor = input.nextInt();

            System.out.printf("Quotient: %d\n", dividend / divisor);
            System.out.printf("Remainder: %d\n", dividend % divisor);
        } catch (InputMismatchException ex) {
            System.out.println("Numbers must be digits only.");
        } catch (ArithmeticException ex) { //built into Java language (you get it for free)
            System.out.println("You cannot divide by zero!");
        } catch (Exception ex) { //Exception is the superclass for many exceptions in Java
            System.out.println("Some unexpected error occured.");
        }

        input.close();
    }
}