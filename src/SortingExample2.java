/* * Short title * J D Eisenberg, 2 Jul 2020 * Long description */

package src; 

import java.util.Scanner;
import java.util.Arrays;
//note the "s" at the end!
public class SortingExample2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] data = {
            3.7,
            12.2,
            41.6,
            19.9,
            2.1
        };
        // display data before sort...        
        System.out.println("Before: " + Arrays.toString(data));
        Arrays.sort(data);
        // this uses an efficient algorithm.        // display data after sort...        
        System.out.println("After: " + Arrays.toString(data));
        input.close();

    }
}