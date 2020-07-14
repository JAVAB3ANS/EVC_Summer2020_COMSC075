package src;

public class Midterm2 {
    public static void main(String[] args) {
        /* 1. Write a single Java statement that declares a double 
        variable named "tang" and assigns the tangent of 45 degrees to it.*/
        /*double tang = Math.tan(Math.PI / 4.0)*/ //More difficult to understand 
        double tang = Math.tan(Math.toRadians(45.0)); //Much easier to understandS
        System.out.printf("Answer: %.2f radian(s)\n", tang);

        /* 2. Write a function call from the Math class that will get the largest 
        integer that is less than or equal tothe value 6.342. Will the return value be an int or a double?*/
        /*Math.floor(6.342);*/ //will be double

        /*3. What is the output of this Java statement? 
        
        System.out.println('Z' – 'X');  // 2
        */

        /* 4. What is the exact output of this code? [6 points]*/
        int n = 10; 
        while (n >= 0) {
            if (n / 3 >= 1) {  // 10 - 2 = 8   8/3 >= 1 => WHILE LOOP CONTINUES
                n -= 2;        //   8 - 2 = 6    6/3 >= 1 => WHILE LOOP CONTINUES
            } else {           //   6 - 2 = 4    4/2 >= 1 => WHILE LOOP CONTINUES 
                n--;           //  4 - 2 = 2    2/2 != (>=) 1 => WHILE LOOP CONTINUES
            }                  //   2 - 2 = 0    0/2 != (>=) 1 => WHILE LOOP CONTINUES
                               // 0 - 1 = -1    => WHILE LOOP ENDS
            System.out.println(n);
        }          
        /* prints out: 
        8
        6
        4
        2
        0
        -1*/

        /* 5. Write a for loop with an int counter variable named count that starts at 14,
              continues as long as count is greater than 8 and subtracts 2 from count after
              each iteration. The body of the loop prints the current value of count.*/

        for(int count = 14; count > 8; count -= 2) { //or count = count - 2
            System.out.println(count);
        }

        /* 6. Output:
            14
            12
            10
        */

        /* Reinterpretation:
            count = 14; 
            while (count > 0) {
                System.out.println(count);
            }
            count -= 2;
        */

        /* 7.Write a while loop that will display the charactesr of str, one pair per 
           line. At the right, you see what the output from the code should look like.
           */

        String str = "artichokes";
        //Your loop goes here
        int pos = 0;
        while (pos < str.length()) {
            System.out.println(str.substring(pos, pos + 2));
            pos += 2;
        }
        /* Output:
            ar
            ti
            ch
            ok
            es
        */

        /* 8. What is the output of this code? */
      /*  class Midterm2{
            public static void main(String[] args) {            // in main, n = 5 and d = 499.5
                int n = 5;
                double d = doStuff(n);
                System.out.println("In main, n=" + n + " and d=" + d);
            }
            public static double doStuff(int d) { // in doStuff n = 99.9 and d = 499.5
                d = d * 5;
                double n = 99.9;
                System.out.println("In doStuff, n=" + n + " and d=" + d);
            }
        } */

        /* 9. Write a single Java statement that declares and initializes an array of int named heights
              with the values 67, 62, 68, 75, and 72. */

        int[] heights = {67, 62, 68, 75, 72};

        /*10. Given the array in question 9, what does System.out.println(heights[3]) print?*/

        System.out.println(heights[3]); //would print 75

        /* 11. Write a single Java statement that prints out the length of the heights array. */

        System.out.println("The array's length is " + heights.length);

        /* 12. What will be in the array data after this code executes? */
            int[] data = {2, 4, 6, 8, 10};
            for (int i = 1; i < data.length; i++) {
                data[i] = data[i] + data[i - 1];
            } 
            //Output: 2 6 12 20 30

        /* 13. Given this array: int[] data = {15, 25, 32, 60, 88}; What value does
            java.util.Arrays.binarySearch(data, 32) return?*/

            java.util.Arrays.binarySearch(data, 32);

            // returns 2, the position where it was found.
            // return -3 if you search for 30, which is not in the array
    }
}