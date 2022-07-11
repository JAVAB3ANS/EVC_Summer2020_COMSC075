package src;

public class Triangle extends GeometricObject {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
        super();
        sideA = 1.0;
        sideB = 1.0;
        sideC = 1.0;
    }

    public Triangle (double sideA, double sideB, double sideC, String color, boolean filled) {
        super(color, filled);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public double getArea() {
        double s = (sideA + sideB + sideC) / 2.0; //semi-perimeter
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
        return area;
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    public double[] getAngles() {
        double [] result = {
            Math.acos((sideB * sideB + sideC * sideC - sideA *sideA) / (2.0 * sideB * sideC)),            
            Math.acos((sideC * sideC + sideA * sideA - sideB * sideB) / (2.0 * sideA * sideC)),            
            Math.acos((sideB * sideB + sideA * sideA - sideC * sideC) / (2.0 * sideA * sideB))
        };
        return result;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    public String toString() {
        return("Triangle with sides " + sideA + ", " + sideB + ", and " + sideC + ". " + super.toString());
    }
}