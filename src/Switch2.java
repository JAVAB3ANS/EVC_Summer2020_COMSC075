/*
 * Switch statement using numeric index
 * Jason Vu - 6/18/2020
 * Ask for battery size and give its price:
 * AA: $0.50
 * AAA: $0.35
 * C: $0.75
 * D: $1.00
 * 9V: $1.45
 * Otherwise, price is zero and display error message.
 */package src;

import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // code goes here
		System.out.print("Enter battery type: ");
        String batteryType = input.nextLine(); //get entire input up to "ENTER" key
		double batteryPrice = 0;  //must specify data type as double
        switch(batteryType) {
			case "AA":
			case "aa": batteryPrice = 0.50; break;
			case "AAA":
			case "aaa": batteryPrice = 0.35; break;
			case "C":
			case "c": batteryPrice = 0.75; break;
			case "D":
			case "d": batteryPrice = 1.00; break;
			case "9V":
			case "9v": batteryPrice = 1.45; break;
			default: batteryPrice = 0; break;
		}
		if(batteryPrice != 0.0) {
			System.out.format("Battery price is $%.2f\n", batteryPrice); //two digits left of decimal point
		} else {
			System.out.println("I do not recognize that battery type.");
		}
        input.close();
    }
}
