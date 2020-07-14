package src;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        double first = input.nextDouble();
        double second = input.nextDouble();

        System.out.print("Enter an operation (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result = 0;

        switch(operator) {
            case '+': 
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                System.out.printf("Error! Operator is not correct!");
                break;
        }
        System.out.println();
        System.out.printf("Your Answer:\n%.1f %c %.1f = %.1f", first, operator, second, result);
        input.close();
    }
}