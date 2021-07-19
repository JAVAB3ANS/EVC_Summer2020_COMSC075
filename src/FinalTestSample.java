package src;

import java.util.Arrays;
import java.util.ArrayList;

public class FinalTestSample {
    public static void main(String[] args) {
        /*Duration d = new Duration(3, 15);
        d = addOneMinute(d);
        System.out.println(d.minutes + ":" + d.seconds);*/

        String str = "1066";
        int intVal = Integer.valueOf(str);
        System.out.println(intVal);

        String s = "example";
        s.toUpperCase();
        System.out.println();

        Integer[] array = {100, 101, 102, 103, 104};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(array));
        list.remove((Integer) 102); //or list.remove(2)
    }

    /*public static Duration addOneMinute(Duration d) {
        //creates new object, different from original d
        d = new Duration(d.minutes + 1, d.seconds);
        //d.minutes++;
        return d;
    }*/
}