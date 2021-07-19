/*
 * Demonstrate use of exceptions in libraries
 */

package src;

class ArrayUtils {
    public static int max(int[] data) throws IllegalArgumentException {
        if (data.length > 0) {
            int maxVal = data[0];
            for (int item: data) {
                if (item > maxVal) {
                    maxVal = item;
                }
            }
            return (maxVal);
        } else {
            throw new IllegalArgumentException("Array length must be greater than zero!");
        }
    }
}
// --------------------------------------
public class UseUtils {
    public static void main(String[] args) {
        int[] empty = new int[0];
        int maximum = ArrayUtils.max(empty);
        System.out.println("Maximum value is " + maximum);
    }
}