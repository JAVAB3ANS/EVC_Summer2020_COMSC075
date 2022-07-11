package src;

public class TestCurrency {
    public static void main(String[] args) {
        Currency norge = new Currency("Norway", "kronor", 1.20);
        reduceExchangeRate(norge);
        System.out.println(norge.getDollarExchange());
    }

    public static void reduceExchangeRate(Currency c) {
          c = new Currency(c.getCountry(), c.getName(), c.getDollarExchange());
    }
}

class Currency {
    private String country;
    private String name;
    private double dollarExchange;

    Currency (String country, String name, double dollarExchange) {
        this.country = country;
        this.name = name;
        this.dollarExchange = dollarExchange;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public double getDollarExchange() {
        return dollarExchange * 0.8;
    }

    public void setDollarExchange(double dollarExchange) {
        this.dollarExchange = dollarExchange;
    }
}