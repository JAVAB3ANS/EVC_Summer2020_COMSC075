package src;

public class TestGeometric {
    public static void main(String[] args) {
        //GeometricObject geom = new Circle(3.0, "green", false); //ok all circles are geometric objects
        //Circle badCircle = new GeometricObject(); //not all geometric objects are circles

        GeometricObject [] shapes = {
            new Circle(3.0, "blue", true),
            new Rectangle(4.5, 7.2, "green", false),
            new Triangle(3.5, 4.6, 6.7, "ecru", true)
        };

        double totalArea = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + i + " is " + shapes[i].toString());
            if (shapes[i] instanceof Rectangle) {
                double diag = ((Rectangle) shapes[i]).getDiagonal();
                System.out.printf("Diagonal is %.2f", diag);
            } else if (shapes[i] instanceof Circle) {
                double diam = ((Circle) shapes[i]).getDiameter();
                System.out.println("Diameter is " + diam);
            } else if (shapes[i] instanceof Triangle) {
                double [] angles = ((Triangle) shapes[i]).getAngles();
                System.out.println("Angles: ");
                for (double angle:angles) {
                    System.out.printf("%.2f ", angle);
                }
                System.out.println(); //make sure to go to a new line
            }
            totalArea += shapes[i].getArea();
        }
        System.out.printf("Total area is %.3f\n", totalArea);
    }
}