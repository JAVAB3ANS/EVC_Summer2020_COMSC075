package src;

import java.util.Scanner; 

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in kilograms: ");
        double weight  = input.nextDouble();
        System.out.println("Input height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("Your BMI is " + bmi + " kg/m^2");
        input.close();    
    }
}