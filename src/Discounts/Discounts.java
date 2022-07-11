/*
 * Jason Vu - 6/25/2020
 * Compare discounts of purchases, using a function to
 * calculate total price, given quantity, unit price, and
 * discount percentage. Calculate.
 */package src;
 
 public class Discounts {
	public static void main(String[] args) {
		double amount1 = getTotal(12, 3.50, 7.5);
		double amount2 = getTotal(14, 3.05, 9.25);
		System.out.printf("Amount 1: $%.2f\n", amount1);
		System.out.printf("Amount 2: $%.2f\n", amount2);
	}
	
	public static double getTotal(int quantity, double unitPrice, double percent) {
		double total = quantity * unitPrice * (1.0 - (percent / 100.0));
		return total;
	}
}
