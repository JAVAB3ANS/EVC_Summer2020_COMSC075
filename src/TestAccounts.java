/* 
 * Jason Vu - 7/17/20
 * Description:
 * Write a program named TestAccounts that creates an array of five Account objects:
    *An Account number 1066 with a balance of $7,500.
    *A SavingsAccount number 30507 with a balance of $4,500 and an APR of 1.5%
    *A CreditCardAccount number 51782737 with a balance of $7,000.00, APR of 8%, and credit limit of $1000.00
    *A CreditCardAccount number 629553328 with a balance of $1,500.00, an APR of 7.5%, and a credit limit of $5,000
    *A CreditCardAccount number 4977201043 with a balance of -$5,000.00, an APR of 7%, and a credit limit of $10,000

*Your program will use a loop to do the following for each account:
- Deposit $2,134.00
- Withdraw $4,782.00
- Print the account status using toString().
- For savings accounts, also display the annual interest
- For credit card accounts, also display the monthly payment
*/
    
package src;

/*Create a class named Account, which has the following private properties:

number: long
balance: double

Create a no-argument constructor that sets the number and balance to zero.

Create a two-parameter constructor that takes an account number and balance.

First, implement getters and setters: getNumber(), getBalance(), setBalance(double newBalance). There is no setNumber() -- once an account is created, its account number cannot change.

Now implement these methods: void deposit(double amount) and void withdraw(double amount). For both these methods, if the amount is less than zero, the account balance remains untouched. For the withdraw() method, if the amount is greater than the balance, it remains untouched.

Then, implement a toString() method that returns a string with the account number and balance, properly labeled.
*/

class Account { //The type Account is already defined ???
    protected long number;
    protected double balance;

    public Account() {
        this.number = 0;
        this.balance = 0.0;
    }

    public Account(long number, double balance) {
        this.number = number;
        this.balance = balance;
    }

    public long getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount; //add amount to the balance
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
        balance -= amount; //incrementally subtract amount from balance
        } 
    }
    //Amount is the money i put into the machine
    //Balance is the money the bank keeps for me

    public String toString() {
        return String.format("Account Number: %s\nBalance: $%.2f\n", number, balance);
        //return Account Number and Balance
    }
} 

/* This class inherits from Account and adds a private apr property, which is the annual percentage rate for interest. Write a no-argument constructor that sets the account number, balanace, and APR to zero. Write a three-argument constructor that takes an account number, balance, and interest rate as a decimal (thus, a 3.5% interest rate is given as 0.035).

Modify toString() to include the interest rate.

Add a getter and setter method for apr. The setter should leave the APR untouched if given a negative value.

Write a calculateInterest() method that returns the annual interest, calculated as the current balance times the annual interest rate.

IMPORTANT: the toString() method must not print the calculated annual interest.
*/

class SavingsAccount extends Account {
    protected double apr; 

    public SavingsAccount() {
        super();
        apr = 0.0;
    }

    public SavingsAccount(long number, double balance, double apr) {  
        super(number, balance);
        this.apr = apr / 100;
    }

    public double getApr(double apr) {
        return apr;
    }

    public void setApr() {
        this.apr = apr / 1;
    }

    public double calculateInterest() {
        return balance * (apr); //annual interest is calculated as the current balance times the annual interest rate
    } 

    public String toString() {
        return String.format(super.toString() + "Interest Rate: %.2f percent\nAnnual Interest: %.2f\n", apr * 100, calculateInterest());
        //return Account Number, Balance, Interest Rate and Annual Interest
    }
} 

/*This class inherits from SavingsAccount and adds a private apr property, which is the annual interest rate charged on the balance. It also has a private creditLimit property (double) which gives the credit limit for the card. Write a no-argument constructor that sets all the properties to zero. Write a four-argument constructor that takes an account number, balance, interest rate as a decimal (thus, a 3.5% interest rate is given as 0.035), and credit limit. Write getters and setters for the apr and creditLimit.

Modify toString() to include the interest rate and credit limit.

Override the withdraw() function so that you can have a negative balance. If a withdrawal would push you over the credit limit, leave the balance untouched. Examples:

If your balance is $300 with a credit limit of $700, you can withdraw $900 (leaving a balance of $-600).
If your balance is $-300 with a credit limit of $700, you can withdraw $350 (leaving a balance of $-650).
If your balance is $-300 with a credit limit of $700, you can not withdraw $500, because that would then owe $800, which is more than your $700 limit.
In short, the maximum amount you can withdraw is your current balance plus the credit limit.

Add a calculatePayment() method that works as follows:

If the balance is positive, the minimum amount you have to pay on your card per month is zero.
Otherwise, your monthly payment is the minimum of 20 and LaTeX: (apr / 12) \cdot (-balance)(apr/12)⋅(−balance)(apr/12)⋅(−balance) 
IMPORTANT: the toString() method must not print the monthly payment.
*/

    class CreditCardAccount extends SavingsAccount {
    private double creditLimit;

    public CreditCardAccount() {
        super();
        apr = 0.0;
        creditLimit = 0.0;
    }

    public CreditCardAccount(long number, double balance, double apr, double creditLimit) {  
        super(number, balance, apr);
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit; //says assignment to creditLimit has no effect LOL
    }
    
    // Override the withdraw() function so that you can have a negative balance. 
    //If a withdrawal would push you over the credit limit, leave the balance untouched. Examples:

    //If your balance is $300 with a credit limit of $700, you can withdraw $900 (leaving a balance of $-600).
    //If your balance is $-300 with a credit limit of $700, you can withdraw $350 (leaving a balance of $-650).
    //If your balance is $-300 with a credit limit of $700, you can not withdraw $500, 
    //because that would then owe $800, which is more than your $700 limit.

    //Says The method withdraw(double, double) of type CreditCardAccount must override or implement a supertype method
    @Override
    public void withdraw(double amount) {
        if (amount < getBalance() + creditLimit) {
            setBalance(getBalance() - amount);
        }
    }
    //Amount is the money i put into the machine
    //Balance is the money the bank keeps for me

    // Add a calculatePayment() method that works as follows:

    //If the balance is positive, the minimum amount you have to pay on your card per month is zero.
    //Otherwise, your monthly payment is the minimum of 20 and (apr/12) * (-balance)

    public double calculatePayment() {
        if (balance >= 0) { //If the balance is positive, the minimum amount you have to pay on your card per month is zero.
            return 0;
        } else { //Otherwise, your monthly payment is the minimum of 20 and (apr / 12) * (-balance)
            return Math.min(20, (apr / 12) * (-balance));
        }
    }

    public String toString() {
        return String.format(super.toString() + "Credit Limit: $%.2f\nMonthly Payment: $%.2f\n", creditLimit, calculatePayment());
    }
    //output Account Number, Balance, Interest Rate, and Credit Limit
} 

/*
    * Write a program named TestAccounts that creates an array of five Account objects:
    *An Account number 1066 with a balance of $7,500.
    *A SavingsAccount number 30507 with a balance of $4,500 and an APR of 1.5%
    *A CreditCardAccount number 51782737 with a balance of $7,000.00, APR of 8%, and credit limit of $1000.00
    *A CreditCardAccount number 629553328 with a balance of $1,500.00, an APR of 7.5%, and a credit limit of $5,000
    *A CreditCardAccount number 4977201043 with a balance of -$5,000.00, an APR of 7%, and a credit limit of $10,000
*/

public class TestAccounts {
    public static void main(String[] args) {
        Account[] testAccounts = {
            new Account(1066, 7500.00), //two-argument constructor named Account
            new SavingsAccount(30507, 4500.00, 1.5), //three-argument constructor named SavingsAccount
            new CreditCardAccount(51782737, 7000.00, 8, 1000.00), //four-argument constructor CreditCardAccount
            new CreditCardAccount(629553328, 1500.00, 7.5, 5000), //four-argument constructor CreditCardAccount
            new CreditCardAccount(4977201043L, -5000.00, 7, 10000) //four-argument constructor CreditCardAccount
            //The constructor CreditCardAccount(long, double, int, int) is undefined
        };

        // Is "4977201043" considered a long number?
        
        for (int i = 0; i < testAccounts.length; i++) {
            testAccounts[i].deposit(2134.0);
            testAccounts[i].withdraw(4782.0);
            System.out.println(testAccounts[i]);
        }

        //Do I have to reinitialize variables for "number", "balance", "apr", "amount", and "creditLimit"?
        //They're not resolved to any variables at the moment

        /*
        System.out.printf("Account: $%.2f" + this.getNumber()); //get account number
        System.out.printf("Balance: $%.2f" + this.getBalance()); //get account balance 
        System.out.printf("Interest Rate: %.2f%" + this.calculateInterest()); //calculate interest
        // So interest rate result has zero parameters and I can't output it from the SavingsAccount class
        System.out.printf("Credit Limit: " + this.getCreditLimit()); //get credit limit
        // So credit limit result has zero parameters and I can't output it from the CreditCardClass
        System.out.printf("Monthly Payment: " + this.calculatePayment()); //calculate payment
        // So monthly payment result has zero parameters and I can't output it from the CreditCardClass
        */
    }
} 