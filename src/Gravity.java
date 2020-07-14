package src;

import java.util.Scanner;

public class Gravity {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a time in seconds: ");
        double fallTime = input.nextDouble();

        double distance = ((0.5 * 9.81) * Math.pow(2, fallTime));
        System.out.format("The number of meters the object will fall in that time is: %.2f m/s\n", (double)distance);
        
        input.close();
    }
}