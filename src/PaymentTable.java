/* Jason Vu - 7/9/2020

   Description: Write a program named PaymentTable.java that prints a table of 
   monthly mortgage payments for a loan.

The main() method will do the following:
- Prompt the user for the principal of the loan in dollars. If the user 
enters a number less than or equal to zero, keep asking.
- Prompt the user for the yearly interest rate on the loan as a percentage. 
If the user enters a number less than or equal to zero, keep asking.
- Display a table of the monthly payment for a loan period of 15, 20, 25, 
and 30 years. Calculate the monthly payment using this formula:

*/

/*
Pseudocode:
print "Enter loan amount: "
double loanAmount = input.nextDouble();
print "Enter annual percentage rate: "
double percentRate = input.nextDouble();
printf "For a %f loan w/ yearly interest %f", loanAmount, percentRate
print "Years: 15; Monthly payment: [insert equation involving years, loanAmount, and percentRate]
and i would repeat that last line for 20, 25, and 30 years
alternatively
I could write a helper method with params of # of years, 
loan amount, and percentage rate that returns the monthly payment
*/package src;

import java.util.Scanner;
 
public class PaymentTable {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      double principal = getValue("Enter loan amount: $", input);

      verifyPrincipal(input, principal);

      double yearlyRate = getValue("Enter annual percentage rate as a percent: ", input);

      int nYears = 0;
      showTable(principal, nYears, yearlyRate);
    }

   public static double getValue(String prompt, Scanner input) {
      System.out.print(prompt);
      return input.nextDouble();
   }

   public static void verifyPrincipal(Scanner input, double principal) {
      do {
         if(principal <= 0) { 
            System.out.println("This number must be greater than zero.");
            principal = getValue("Enter loan amount: $", input);
         } 
      } while(principal <= 0);
   }
 
   public static double calculatePayment(double principal, int nYears, double yearlyRate) {
       
      // Convert interest rate into a decimal
      // eg. 6.5% = 0.065

      yearlyRate /= 100;
       
      // Monthly interest rate 
      // is the yearly rate divided by 12
       
      double monthlyRate = yearlyRate / 12.0;
       
      // The length of the term in months 
      // is the number of years times 12
       
      int termInMonths = nYears * 12; //would take any year -   15, 20, 25, 30 - and multiply it to 12
       
      // Calculate the monthly payment

      // The Math.pow() method is used calculate values raised to a power
       
      double monthlyPayment =  (principal*monthlyRate) /  (1-Math.pow(1+monthlyRate, -termInMonths));
       
      return monthlyPayment;
   }
    
   public static void showTable(double principal, int nYears, double yearlyRate) {
      System.out.println();
      System.out.printf("For a %.2f loan with yearly interest rate of %.2f: \n", principal, yearlyRate);
      System.out.print("Years ");
      System.out.print("Monthly Payment\n");

      for(nYears = 15; nYears <= 30; nYears += 5) {
         double monthlyPayment = calculatePayment(principal, nYears, yearlyRate); //calculation
         System.out.print(nYears);
         System.out.printf("  %.2f\n", monthlyPayment);
     }
   }
}