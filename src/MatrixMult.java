/* Jason Vu - 7/10/2020
 * Description:
 * Your program, named MatrixMult.java, will prompt the user for the number 
 * of rows and columns for the first matrix, then its contents. It will then 
 * prompt the user for the number of rows and columns for the second matrix, 
 * then its contents. It will call your multiplyMatrix() method and print the 
 * resulting matrix.

 * If the matrices are not compatible, your program should give an error message. 
 * Checking for compatibility is the responsibility of main(), not multiplyMatrix().
 * 
 */package src;

import java.util.Scanner;

public class MatrixMult {
    public static void main(String args[]) {
        int m, n, p, q;

        Scanner input = new Scanner(System.in);

        m = getValue("Enter the number of rows of first matrix: ", input); //calls getValue() method
        n = getValue("Enter the number of columns of first matrix: ", input); //calls getValue() method

        p = getValue("Enter the number of rows of second matrix: ", input); //calls getValue() method
        q = getValue("Enter the number of columns of second matrix: ", input); //calls getValue() method
 
        verifyMatrix(input, m, n, p, q); //check for row and column capatibility by invoking verifyMatrix() method

        multiplyMatrix(input, m, n, p, q); //invoking multiplyMatrix to multiply and print matrix
    }

    public static int getValue(String prompt, Scanner input) {
        System.out.print(prompt);
        return input.nextInt();
    }

    public static void verifyMatrix(Scanner input, int m, int n, int p, int q) {
        do { // check for compatibility between rows and columns
            // if column 1 (n) isn't equal to row 1 (p), prints this message saying they can't be multiplied
            // if column 2 (q) isn't equal to row 2 (m), prints this messgae saying they can't be multiplied
            if ((n != p || m != q)) {
                System.out.println("The matrices can't be multiplied with each other.");
            }
        } while (n != p || m != q);
    }
    public static void multiplyMatrix(Scanner input, int m, int n, int p, int q) {
        int sum = 0, c, d, k;

        int first[][] = new int [m][n]; //initialize multidimensional array with rows and columns of 1st matrix
        int second[][] = new int[p][q]; //initialize multidimensional array with rows and columns of 2nd matrix
        int multiply[][] = new int[m][q];

        System.out.print("Enter elements of first matrix: ");

        for (c = 0; c < m; c++) { //swap c with m and d with ns
            for (d = 0; d < n; d++) 
                first[c][d] = input.nextInt(); //input for "n" of elements that can be provided with rows and columns of matrix 1
        }

        System.out.print("Enter elements of second matrix: ");

        for (c = 0; c < p; c++) {
            for (d = 0; d < q; d++) 
                second[c][d] = input.nextInt(); //input for "n" of elements that can be provided with rows and columns of matrix 2
        }

        //multiply matrix 1 and matrix 2 together

        for (c = 0; c < m; c++) {
            for (d = 0; d < q; d++) {
                for (k = 0; k < p; k++) 
                    sum = sum + first[c][k]*second[k][d];

                    multiply[c][d] = sum;
                    sum = 0;
            }
            
        }

        System.out.println();
        System.out.println("Matrix C: ");

        for (c = 0; c < m; c++) {
            for (d = 0; d < q; d++) 
                System.out.print(multiply[c][d] + " ");
                System.out.print("\n");
        }
        System.out.println();
    } 
}