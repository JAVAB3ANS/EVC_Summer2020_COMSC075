/* Create Stock object 
*/package src;

import java.util.Scanner;

class Stock {
    //String symbol = ""; //here, default is null -- invalid reference
    //String name = ""; //here, default is null -- invalid reference
    String symbol;
    String name;
    double previousClosingPrice; //default to zero
    double currentPrice; //default to zero    

    Stock() {
        //leave everything as default value
    }

    Stock(String newSymbol, String newName) { //initialize variables as parameters
        symbol = newSymbol;
        name = newName;
    }

    double getChangePercent() {
        double result;
        if(previousClosingPrice != 0.0) {
            result = 100 * (currentPrice - previousClosingPrice) / previousClosingPrice;
        } else {
            result = 0.0;
        }
        return result;
    }

    public String toString() {
        String result = String.format("%s (%s) - Previous: $%.2f Current %.2f", name, symbol, previousClosingPrice, currentPrice);
        return result;
    }
}

public class StockMarket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Stock emptyStock = new Stock();
        System.out.println("Stock built from no-arg constructor is " + emptyStock);

        Stock myStock = new Stock("ORCL", "Oracle");

        myStock.previousClosingPrice = 17.00;
        myStock.currentPrice = 23.50;

        double change = myStock.getChangePercent();
        System.out.printf("The percent change is %.2f%%\n", change);

        System.out.println(myStock);

        System.out.println(myStock.symbol.toLowerCase());
        System.out.println(emptyStock.symbol.toLowerCase());

        input.close();
    }
}