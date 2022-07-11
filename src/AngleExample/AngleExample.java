package src;

/*
 * Jason Vu - 7/13/2020
 * Implement an angle as degrees, minutes, and seconds
 * with methods to add one angle to another and compare two angles.
 */

import java.util.Scanner;

class Angle {
    private int degrees;
    private int minutes;
    private double seconds;

    Angle(int degrees, int minutes, double seconds) {
        this.degrees = degrees % 360;
        this.minutes = Math.min(Math.abs(minutes), 59);
        this.seconds = Math.min(Math.abs(seconds), 59.999999999);
    }

    Angle() {
        this(0, 0, 0.0);
    }
    /*Add this angle to another angle, returning the sum of the two angles.*/

    public Angle add (Angle other) {
        double sumSeconds = this.seconds + other.seconds;

        int carry = (int) sumSeconds / 60; // sum may be greater than 60
        sumSeconds %= 60;

        int sumMinutes = this.minutes + other.minutes + carry;
        carry = sumMinutes / 60;

        sumMinutes %= 60;
        int sumDegrees = this.degrees + other.degrees + carry;
        return new Angle(sumDegrees, sumMinutes, sumSeconds);
    }

    /*Compare this angle to another angle.
     * Return -1 if this angle is less than the other.
     * 0 if they are equal.
     * 1 if this angle is greater than the other.
     */

    public int compareTo(Angle other) {
        int result = 0;
        if (this.degrees > other.degrees) {
            result = 1;
        } else if (this.degrees < other.degrees) {
            result = -1;
        } else {
            if(this.minutes > other.minutes) {
                result = 1;
            } else if (this.minutes < other.minutes) {
                result = -1;
            } else {
                if (this.seconds < other.seconds) {
                    result = -1;
                } else if (this.seconds > other.seconds) {
                    result = 1;
                }
            }
        }
        return result;
    }

    public String toString() {
        return String.format("%d\u00b0 %d\u2032 %.3f\u2033", this.degrees, this.minutes, this.seconds);
    }
}

public class AngleExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first angle as minutes, degrees, and seconds: ");
        Angle angle1 = new Angle(input.nextInt(), input.nextInt(), input.nextDouble());

        System.out.print("Enter second angle as minutes, degrees, and seconds: ");
        Angle angle2 = new Angle(input.nextInt(), input.nextInt(), input.nextDouble());

        System.out.print("Angle 1 (" + angle1.toString() + ") is ");
        if (angle1.compareTo(angle2) < 0) {
            System.out.print("Less than!");
        } else if (angle1.compareTo(angle2) > 0) {
            System.out.print("Greater than!");
        } else {
            System.out.print("Equal to!");
        }

        System.out.println("Angle 2 (" + angle2.toString() + ")");

        Angle angle3 = angle1.add(angle2);
        System.out.println("The sum of the two angles is " + angle3);

        input.close();
    }
}