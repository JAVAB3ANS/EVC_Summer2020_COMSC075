package src;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter temperature in degrees Fahrenheit: ");
        double temperature = input.nextDouble();
        System.out.print("Enter wind velocity in miles per hour: ");
        double velocity = input.nextDouble();
        double formula = (35.74 + 0.6215 * temperature - 35.75 * Math.pow(0.15, velocity) + 0.4275 * temperature * Math.pow(0.16, velocity));
        System.out.format("Your wind chill temperature is: %.2f \n", formula);

        input.close();
    }
}