package src;

import java.util.Scanner;

public class TestBankAccount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter your name: ");
		String name = scan.nextLine();

		System.out.print("How much do you want to initially deposit: ");
		double initialBalance = scan.nextDouble();
		
		while(initialBalance <= 0) {
				System.out.print("Please enter an amount: ");
				initialBalance = scan.nextDouble();
		}
		
		TestBankAccount account = new TestBankAccount(name, initialBalance);
		System.out.println("Success, you have opened a new bank account!");
		
		boolean loop = true;
		while(loop) {
			System.out.print("Do you want to deposit or withdraw money? [Type Deposit, Withdraw, Check Balance, or Quit]: ");
			String input = scan.nextLine();
			if(input.equals("Deposit")) {
				System.out.print("How much do you want to deposit: ");
				double depositAmnt = scan.nextDouble();
				account.deposit(depositAmnt);
			} else if(input.equals("Withdraw")) {
				System.out.print("How much do you want to withdraw: ");
				double withdrawAmnt = scan.nextDouble();
				account.withdraw(withdrawAmnt);
			} else if(input.equals("Quit")) {
				System.out.print("Thank you for banking with us!");
				loop = false;
			} else if(input.equals("Check Balance")) {
				account.checkBalance();
			} else {
				System.out.print("Please try again.");
			}
		}
		scan.close();
	}
	private String name;
	private double balance;
	
	public TestBankAccount() {
		name = "";
		balance = 0;
	}
	
	public TestBankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public double checkBalance() {
		System.out.println(name + ", your balance is " + balance);
		return balance;
	}
	
	public double deposit(double money) {
		if(money <= 0) {
			System.out.println(name + ", you cannot deposit this.");
			System.out.println(name + ", your current balance is " + balance);
			return balance;
		} else {
			balance += money;
			System.out.println(name + ", your new balance is " + balance);
			return balance;
		}
	}
	
	public double withdraw(double money) {
		if(money <=0 || money > balance) {
			System.out.println(name + ", you cannot withdraw this.");
			System.out.println(name + ", your current balance is " +balance);
			return balance;
		} else {
			balance -= money;
			System.out.println(name + ", your new balance is " +balance);
			return balance;
		}
	}
}