package src;

import java.util.Scanner;
public class Price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity of the following item: ");
        int quantity = input.nextInt();
        System.out.print("Enter the price of the following item: ");
        double price = input.nextDouble();
        double total = quantity * price;
        System.out.println("The total cost is $" + total);
		input.close();
    }
}
