package src;

class Rectangle {
    double width;
    double height;

    Rectangle() {
        width = 1.0;
        height = 1.0;
    }

    Rectangle(double w, double h) {
        width = w;
        height = h;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2.0 * (width + height);
    }

    double getDiagonal() {
        return Math.sqrt(width * width + height * height);
    }

    public String toString() {
        return String.format("Width: %.2f, Height: %.2f", width, height); //don't use r1.width/r1.height or r2 because it's not part of the blueprint
    }
}

public class RectangleReferences {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(3.0, 5.5);

        System.out.println("r1 is " + r1.toString());
        System.out.println("r2 is " + r2.toString());

        r2 = r1; //r2 now refers to same object on heap as r1
        r2.width = 17.3; //this will affect both r1 and r2

        /*
            r1 -> (17.3, 22.4)
            r2 -> ^
            r3 -> (17.3, 5);
        */
        //changing one of them will change all of them

        System.out.println("r1 is now " + r1.toString());

        //This allocates a brand new object on the heap
        Rectangle r3 = new Rectangle(r1.width, r1.height);
        r1.height = 22.4; //will change r1 object 

        System.out.println("r3 is still " + r3);
        System.out.println("But r1 has changed to " + r1);
 
        
/*        
        System.out.format("r1 has width %.1f and height %.1f\n", r1.width, r1.height);
        System.out.format("r2 has width %.1f and height %.1f\n", r2.width, r2.height);

        double area1 = r1.getArea();
        double perimeter1 = r1.getPerimeter();
        double area2 = r2.getArea();
        double perimeter2 = r2.getArea();
        System.out.printf("R1 Area: %.2f; R1 Perimeter: %.2f\n", area1, perimeter1);
        System.out.printf("R2 Area: %.2f; R2 Perimeter: %.2f\n", area2, perimeter2);

        System.out.printf("Diagonal of rectangle r2 is: %.2f\n", r1.getDiagonal(), r2.getDiagonal());*/
    }
}