/* Focal Length Calculator
 * 1) obj - distance from lens to object being photographed
 * 2) img - distance from lens to film
 * Both of these will be measured in centimeters
 * It'll calculate and display the focal length of the lens,
 * calculated as (obj * img) divided by (obj + img)
 */package src;

import java.util.Scanner;

public class FocalLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance from lens to object in cm: ");
        double obj = input.nextInt();
        System.out.print("Enter distance from lens to film in cm: ");
        double img = input.nextInt();

        double focalLength = (obj * img) / (obj + img);
        System.out.printf("The focal length is %.2f\n", focalLength);
        input.close();
    }
}