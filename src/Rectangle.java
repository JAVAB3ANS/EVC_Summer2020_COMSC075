package src;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        super();
        width = 1.0;
        height = 1.0;
    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2.0 * (width + height);
    }

    public double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return ("Rectangle with dimensions " + width + " x " + height + ", " + super.toString());
    }
}