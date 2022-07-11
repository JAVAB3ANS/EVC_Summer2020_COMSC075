package src;

import java.util.Scanner;

public class Accounts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an ID number: ");
        int id = input.nextInt();

        System.out.print("Enter a balance amount: ");
        double balance = input.nextDouble();

        AccountExample account = new AccountExample(id, balance);

        System.out.print("Enter annual interest rate: ");
        double annualInterestRate = input.nextDouble();

        account.setAnnualInterestRate(annualInterestRate);
        account.withdraw(2500.0);
        account.deposit(3000.0);

        System.out.println();
        System.out.printf("ID Number: %d\n", account.getId());
        System.out.printf("Balance: $%.2f\n", account.getBalance());
        System.out.printf("Monthly Interest: $%.2f\n", account.getMonthlyInterest());
        System.out.println("Date Created: " + account.getDateCreated());

        input.close();

    }
}

class AccountExample {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;

    public AccountExample() {
        dateCreated = new java.util.Date();
    }

    public AccountExample(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        AccountExample.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}