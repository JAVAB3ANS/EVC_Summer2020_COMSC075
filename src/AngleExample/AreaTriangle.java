package src;

/*
 * Jason Vu - 6/17/2020
 * Geometry: area of triangle
 * Write a program that prompts the user to enter three 
 * points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area.
 * The input cursor must appear on the same line as the last word of the input prompt.
 * The formula for computing the area of a triangle is S =(side1 + side2 + side3)/2;
 * area = sqrt( s (s - side1) (s - side2) (s - side3))
 */

import java.util.Scanner; //bring this class into our program

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //user input for first, second, and third coordinates
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter x value of the first coordinate: "); //user input for x1
        double x1 = keyboard.nextDouble();
        System.out.print("Enter y value of the first coordinate: "); //user input for y1
        double y1 = keyboard.nextDouble();
        System.out.print("Enter x value of the second coordinate: "); //user input for x2
        double x2 = keyboard.nextDouble();
        System.out.print("Enter y value of the second coordinate: "); //user input for y2
        double y2 = keyboard.nextDouble();
        System.out.print("Enter x value of the third coordinate: "); //user input for x3
        double x3 = keyboard.nextDouble();
        System.out.print("Enter y value of the third coordinate: "); //user input for y3
        double y3 = keyboard.nextDouble();
        
        //s stands for semi-perimeter
        //processing with the white box
        //Use area equation: area = sqrt( s (s - side1) (s - side2) (s - side3))
        double sp_1 = Math.sqrt((double)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2))); //side 1
        double sp_2 = Math.sqrt((double)(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2))); //side 2
        double sp_3 = Math.sqrt((double)(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2))); //side 3
        
        double svar = (sp_1 + sp_2 + sp_3)/2.0; //add all three sides and divide by 2
        double num_in_sqrt = svar * (svar - sp_1) * (svar - sp_2) * (svar - sp_3); //prepare num_in_sqrt to square in the next step
        double area = Math.sqrt(num_in_sqrt); //get area by squaring num_in_sqrt
        
        //outputs in terminal to user
        //Uses System.out.format to properly format number
        System.out.format("The area of the triangle is %.1f square units.\n", area); //number goes up to tenths place
        // .1 tells how many decimal places I want
        input.close();
        keyboard.close();
    }
}
