package src;

import java.util.Scanner;

class Element {
    private String name;
    private String symbol;
    private double weight;
    private int group;
    private int period;

    public Element (String newName, String newSymbol, double newWeight, int newGroup, int newPeriod) {
        name = newName;
        symbol = newSymbol;
        weight = Math.abs(newWeight);
        group = Math.abs(newGroup);
        period = Math.abs(newPeriod);
    }

    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getWeight() {
        return weight;
    }

    public int getGroup() {
        return group;
    }

    public int getPeriod() {
        return period;
    }
}

public class ArrayOfObjects {
    public static void main(String[] args) {
        Element[] periodicTable = {
            new Element("Hydrogen", "H", 1.008, 1, 1),
            new Element("Helium", "He", 4.0026, 1, 18),
            new Element("Boron", "B", 10.811, 2, 13),
        };

        Scanner input = new Scanner(System.in);
        System.out.print("Enter lower limit of atomic weight: ");
        double low = input.nextDouble();
        System.out.print("Enter upper limit of atomic weight: ");
        double high = input.nextDouble();

        //swap low and high if given out of order
        if (low > high) {
            double temp = low;
            low = high;
            high = temp;
        }

        for (int i = 0; i < periodicTable.length; i++) {
            double weight = periodicTable[i].getWeight();
            if(weight >= low && weight <= high) {
                System.out.printf("%s (%s) %.3f\n", periodicTable[i].getName(), periodicTable[i].getSymbol(), weight);
            }
        }

        input.close();
    }
}