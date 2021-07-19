package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DelimiterTest {
    public static void main(String[] args) {
        File censusFile = new File("./txt/states2019.csv");
        try {
            Scanner input = new Scanner(censusFile);
            input.useDelimiter("[,\\n]");
            while (input.hasNext()) {
                String state = input.next();
                int population = input.nextInt();
                System.out.println(state + "/" + population);
            }
            input.close();  
        } catch (FileNotFoundException ex) {
            System.out.println("Could not open file!");
        }
    }
}