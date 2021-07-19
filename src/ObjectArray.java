package src;

public class ObjectArray {
    public static void main(String[] args) {
        Objects object[] = new Objects[2];
        object[0].setData(1,2);
        object[1].setData(3,4);
        System.out.println("For Array Element 0: ");
        object[0].showData();
        System.out.println("For Array Element 1: ");
        object[1].showData();
    }
}

class Objects {
    int a;
    int b;
    public void setData(int c, int d) {
        a = c;
        b = d;
    }
    public void showData() {
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
    }
}