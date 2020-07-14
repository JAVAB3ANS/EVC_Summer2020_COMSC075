package src;

class Circle {
    private double radius;
    public Circle (double radius) {
        this.radius = Math.abs(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        if (newRadius > 0) {    
            radius = newRadius;
        }
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public String toString() {
        return String.format("Circle with radius %.3f", radius);
    }
}

public class CircleStuff {
    public static void main(String[] args) {
        Circle c1 = new Circle (-2.4);
        System.out.println(c1);
        System.out.println(c1.getArea());
        
        Circle c2 = new Circle(3.7);
        c2.setRadius(-22.0);
        System.out.println(c2);
        System.out.println(c2.getArea());
    }
}