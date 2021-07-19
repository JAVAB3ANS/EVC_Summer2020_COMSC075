/*
 * Shipping
 * Jason Vu - 6/24/2020
 * Your program, named  Shipping.java should ask for 
 * the weight of the package and display the shipping cost. 
 * If the weight is negative or zero, display a message Weight 
 * must be greater than zero. If the weight is greater than 25, 
 * display a message Cannot ship - maximum weight is 25 pounds. 
 * Use a double variable for the weight; a package could weigh 3.21 pounds.
 */package src;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        
        System.out.print("Enter weight of package in pounds: ");
        double weight = input.nextDouble();
        
        if (weight <= 0) {
			System.out.println("Weight must be greater than zero.");
        } else if (0 > weight || weight <= 2) {
			double cost = 3.5;
			System.out.format("Cost: $%.2f\n", cost); 
		} else if (2 > weight || weight <= 7) {
			double cost = 5.8;
			System.out.format("Cost: $%.2f\n", cost); 
		} else if (7 > weight || weight <= 15) {
			double cost = 9.2;
			System.out.format("Cost: $%.2f\n", cost); 
		} else if (15 > weight || weight <= 25) {
			double cost = 11.75;
			System.out.format("Cost: $%.2f\n", cost); 
		} else if (weight > 25) {
			System.out.println("Cannot ship - maximum weight is 25 pounds."); 	
		}
        
        input.close();
    }
}
