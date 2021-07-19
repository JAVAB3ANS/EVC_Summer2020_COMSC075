package src;

import java.util.ArrayList;
import java.util.Arrays;

public class RemovalTest {
    public static void removeAll(ArrayList < String > list, String thingToRemove) {
        int index = 0;
        while (index < list.size()) {
            if (list.get(index).equals(thingToRemove)) {
                list.remove(index); //remove the item at this positino
            } else {
                index++; //no match; try next item
            }
        }
    }

    public static void main(String[] args) {
        String[] arr = {
            "A",
            "B",
            "B",
            "C",
            "D",
            "B",
            "E"
        };
        ArrayList < String > letters = new ArrayList < > (Arrays.asList(arr));

        System.out.println("At start, letters = " + letters);
        removeAll(letters, "B");
        System.out.println("After: " + letters);
    }
}