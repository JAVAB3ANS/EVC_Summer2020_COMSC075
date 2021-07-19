/*
 * Get information from an Exception object
 */

package src;

public class ExceptionInfo {
    public static void main(String[] args) {
        try {
            int[] arr = {100, 101, 102};
            int invalid = arr[20];
            System.out.println(invalid);
        } catch(IndexOutOfBoundsException ex) {
            //process exception here
            ex.printStackTrace();
        }
    }
}