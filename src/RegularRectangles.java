package src;

public class RegularRectangles {
    public static double getArea(double width, double height) {
        double result = width * height;
        return result;
    }

    public static double getArea(double squareSide) {
        double result = squareSide * squareSide;
        return result;
    }

    public static double getPerimeter(double width, double height) {
        double result = 2.0 * (width + height);
        return result;
    }

    public static void main(String[] args) {
        double r1Width = 3.5;
        double r1Height = 4.0;
        double area1 = getArea(r1Width, r1Height);
        double perim1 = getPerimeter(r1Width, r1Height);
        System.out.printf("Rectangle 1's Area: %.2f, Perimeter: %.2f\n", area1, perim1);
    }
}