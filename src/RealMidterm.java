package src;

public class RealMidterm {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i+= 2) {
            System.out.println(i + " ");
        }

        int n = 0;
        while (n < 10) {
            if (n % 2 == 0) {
                n += 7;
            } else {
                n -= 5;
            }
            System.out.println(n);
        }

        int y = 0;
        for (int i = 0; i < 10; ++i) {
            y += i;
        }
        System.out.println(y);

        /*double sum = 0;
        double d = 0;
        while (d != 10.0) {
            d += 0.1;
            sum += sum + d;
        }*/ //program never stops because d is always 0.1 inside the loop
        
       
    }
    public static int xmethod(int n, long t) {
        System.out.println("int");
        return n;
    }

    public static long xmethod(long n) {
        System.out.println("long");
        return n;
    }

    public static int f(int number) {
        return number;
    }
}