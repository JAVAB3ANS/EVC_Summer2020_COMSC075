/*
 * Short title
 * J D Eisenberg, 1 Jul 2020
 * Show how you can return a new array as a result.
 */package src;

 public class Squaring {
    
    public static int[] square(int[] arr) {
        int[] result = new int[arr.length];
        
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i] * arr[i];
        }
        return result;
    }
    
    public static void main(String[] args) {
       int[] data = {10, 11, 12};
       int[] squared = square(data);
       displayArray(squared);
    }
    
    public static void displayArray(int[] list) {
        final int PER_LINE = 10;
        int counter = 0;
        for (int index = 0; index < list.length; index++) {
            System.out.print(list[index] + " ");
            counter++;
            if (counter == PER_LINE) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) {
            System.out.println();
        }
    }

}
