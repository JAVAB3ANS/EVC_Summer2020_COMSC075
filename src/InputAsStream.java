package src;

import java.util.Scanner;

public class InputAsStream {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int years = input.nextInt();

        input.nextLine(); //clear input stream up and including newLine
        //but don't assign it as variable
        //strings are pretty much objects

        System.out.print("Enter your weight in kg: ");
        int kg = input.nextInt();

        System.out.printf("Age: %d, Weight: %d\n", years, kg);

       /* System.out.print("Enter your name: ");
        String myName = input.nextLine();

        System.out.print("Age is " + years + " your name is |" + myName + "|");*/

        input.close();
    }
}