package src;

import java.util.Scanner;
public class RoomTemperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in your room in \u00b0F: ");
        int temperature = input.nextInt();
        if (temperature < 55) {
            System.out.println("You must be freezing.");
        } else if (temperature < 65) {
            System.out.println("That is a bit chilly.");
        } else if (temperature < 75) {
            System.out.println("That is a comfortable temperature.");
        } else if (temperature < 85) {
            System.out.println("That's a bit warm.");
        } else {
            System.out.println("That's too hot for me!");
        }
        input.close();
    }
}