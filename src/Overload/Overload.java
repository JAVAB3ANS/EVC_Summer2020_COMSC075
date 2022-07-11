package src;

public class Overload {
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static double max(double a, double b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static int max(int a, int b, int c) {
        int maxAB = max(a, b);
        return max (maxAB, c);
    }

    public static void main(String[] args) {
        System.out.println(max(3, 4));
        System.out.println(max(3.2, 2.1));
        System.out.println(max(3, 4.7));
        System.out.println(max(7, 10, 3));
    }
}