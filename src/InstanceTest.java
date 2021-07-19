package src;

public class InstanceTest {
    public static void main (String[] args) {
        GeometricObject geom  = new Rectangle(4.0, 3.0, "purple", true);
        System.out.println("This geometric object has area " + geom.getArea());
        System.out.println("Its perimeter is " + geom.getPerimeter());

        //but I can't do this
        //System.out.println("Its diagonal is " + geom.getDiagonal());
        /* When you use instanceOf to figure out the run-time contents of a reference
         * You will almost always need to use a cast to cast the object to the appropriate
         * type so that you can use the methods that belong to that specific type.*/

        if(geom instanceof Rectangle) { //if at run-time, geom refers to a Rectangle object
            double diag = ((Rectangle) geom).getDiagonal();
            System.out.println("The diagonal is " + diag);
        }

        GeometricObject [] shapes = {
            new Circle(3.0, "blue", true),
            new Rectangle(4.5, 7.2, "green", false),
            new Triangle(3.5, 4.6, 6.7, "ecru", true)
        };

        double totalArea = 0.0;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println("Shape " + i + " is " + shapes[i].toString());
            totalArea += shapes[i].getArea();
        }
        System.out.printf("Total area is %.3f\n", totalArea);
    }
}