/*
 * Triangle
 * Jason Vu - 6/24/2020
 * Write a program named Triangle.java that asks for the lengths 
 * of the three sides of a triangle and computes the perimeter if 
 * the input is valid. The input is valid if the sum of every pair 
 * of two sides is greater than the remaining side. For example, the 
 * lengths 3, 4, and 5 define a valid triangle: 3 plus 4 is greater 
 * than 5; 4  plus 5 is greater than 3, and 5 plus 3 is greater than 
 * 4. However, the lengths 7.2, 2.4, and 4 do not specify a valid 
 * triangle because 2.4 plus 4 is not greater than 7.2.
 */package src;

import java.util.Scanner;

public class Triangle2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
        
		System.out.print("Enter lengths of sides of the triangle: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
			System.out.format("The perimeter of the triangle is %.1f\n", a + b + c);
		} else {
			System.out.println("Those sides do not specify a valid triangle.");
		}
        
        input.close();
    }
}
