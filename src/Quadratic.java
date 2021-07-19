package src;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, and c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        input.close();
        double discr = b * b  - 4 * a * c;
        if (discr < 0) {
            System.out.println("The equation has no solution in the reals!");
        } else {
            double r1 = (-b + Math.sqrt(discr)) / (2*a);
            double r2 = (-b + Math.sqrt(discr)) / (2*a);
            if(discr == 0) {
                System.out.format("The single solution is %.3f. ", r1);
            } else {
                System.out.format("The solutions are %.3f and %.3f.\n", r1, r2);
            }
        }
    }
}