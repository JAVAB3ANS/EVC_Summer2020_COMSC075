package src;

import java.util.Scanner;
import java.util.Random;

public class Histogram {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of samples: ");

        int samples = input.nextInt();

        do {
            if (samples <= 0) {
                System.out.println("Silly goose! Please generate some samples!");
            }
        } while (samples <= 0);
        
        int[] arr = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        System.out.println("Good choice! Generating " + samples + " samples...\nHere are your samples: ");
        for (int i = 1; i <= samples; i++) {
            int ran = random.nextInt(10);
            if (i == samples) {
                System.out.println(ran);
            } else {
                System.out.println(ran + ", ");
            }
            arr[ran] += 1;
        }
        System.out.println("\nARRAY:");
        System.out.print("[");  
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length -1) {
                System.out.print(arr[i] + "");
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]\nPERCENTAGES: ");

        for (int i = 0; i < arr.length; i++) {
            double percent = (double)arr[i]/(double)samples*100;

            System.out.printf("%.2f", percent);

            if(i == arr.length -1) {
                System.out.print("%");
            } else {
                System.out.print("%, ");
            }
        }
        input.close();
    }
}