package src;

import java.util.Scanner;

public class TwoDimensionalMatrix {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int rows = getValue("Enter number of rows: ", input);
      int columns = getValue("Enter number of columns: ", input);

      // defining two dimensional array java
      int[][] numbers = new int[rows][columns];

      verifyMatrix(rows, columns);

      // filling java matrix
      multiplyMatrix(input, numbers, rows, columns);

      // printing 2d array in matrix form in java
      printingMatrix(numbers, rows, columns);
   }

   public static int getValue(String prompt, Scanner input) {
      System.out.print(prompt);
      return input.nextInt();
   }

   public static void verifyMatrix(int rows, int columns) {
      do {
         if (rows != columns) {
            System.out.println("Matrix rows and columns not compatible!");
         }
      } while (rows != columns);
   }

   public static void multiplyMatrix(Scanner input, int num[][], int rows, int columns) {
      System.out.println("Enter elements in matrix: ");
      for(int a = 0; a < rows; a++) {
         for(int b = 0; b < columns; b++) {
            num[a][b] = input.nextInt();
         }
      }
   }

   public static void printingMatrix(int num[][], int rows, int columns) {
      System.out.println();
      System.out.println("Here is your matrix: ");
      for(int a = 0; a < rows; a++) {
         for(int b = 0; b < columns; b++) {
            System.out.print(num[a][b] + " ");
         }
      }
      System.out.println();
   }
}
