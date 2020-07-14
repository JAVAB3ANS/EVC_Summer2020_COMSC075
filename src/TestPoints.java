package src;

import java.util.Scanner;

class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance(MyPoint otherPoint) {
        return distance(otherPoint.x, otherPoint.y);
    }

    public double distance(double x, double y) {
        double deltaX = this.x - x;
        double deltaY = this.y - y;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

    public static double distance(MyPoint pointA, MyPoint pointB) {
        return pointA.distance(pointB);
    }

    public String toString() {
        return String.format("(%f, %f)", x, y);
    }
}

public class TestPoints {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        MyPoint point1 = new MyPoint();
        MyPoint point2 = new MyPoint(10.0, 30.5);

        double dist = point1.distance(point2);
        System.out.println("Distance from " + point1 + " to " + point2 + " is " + dist);

        //check it with all three methods
        double dist2 = point1.distance(10.0, 30.5);
        double dist3 = MyPoint.distance(point1, point2);
        System.out.println("dist2 is " + dist2);
        System.out.println("dist3 is " + dist3);

        input.close();
    }
}

