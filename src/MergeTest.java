/*
* Jason Vu
* Description: Write a test program named MergeTest.java 
* that prompts the user for the lengths and contents of two sorted lists. 
* Write the following method that merges two sorted lists into a new sorted 
* list. public static int[] merge(int[] list1, int[] list2) Implement the 
* method in a way that takes at most list1.length + list2. length comparisons. 
* Write a test program that prompts the user to enter two sorted lists and 
* displays the merged list.
* 7/6/2020
*/package src;

import java.util.Scanner;
 
public class MergeTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of list 1: ");
        int[] list1 = new int[input.nextInt()]; //initialize list1 array

        for (int i = 0; i < list1.length; i++) {
            list1[i] = input.nextInt();
        }

        System.out.print("Enter size of list 2: ");
        int[] list2 = new int[input.nextInt()]; //initialize list2 array
        for (int i = 0; i < list2.length; i++) {
            list2[i] = input.nextInt();
        }

        System.out.print("The values in List 1 are: \n");
        
        for (int i = 0; i < list1.length; i++) {
            System.out.print(list1[i]+ " "); //displays list1 values in new line
        }

        System.out.print("The values in List 2 are: \n");

        for (int i = 0; i < list2.length; i++) {
            System.out.print(list2[i]+ " "); //displays list2 values in new line
        }

        //doesn't fail on lists of unequal size or when one list is completely exhausted before the other
        int[] list3 = merge(list1, list2);

        System.out.println("The merged list is: \n");

        for (int i = 0; i < list3.length; i++) {
            System.out.print(list3[i]+ " ");
        }
        input.close();
    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] list3 = new int[list1.length + list2.length]; //merges list 1 and list 2 together

        int j = 0, k = 0;
        for (int i = 0; i < list3.length; i++) { //i starts at 0, i increases incrementally for every time it is less than the length of the two lists combined
            if (k < list2.length && list1[j] > list2[k] ) {
                list3[i] = list2[k];
                k++;
            } else if (j < list1.length) {
                list3[i] = list1[j];
                j++;
            }
        }

    return list3;
    
    }
}