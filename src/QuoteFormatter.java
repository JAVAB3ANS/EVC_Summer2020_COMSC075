package src;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class QuoteFormatter {
    public static void main(String[] args) {
        File inFile = new File("./txt/QuoteFormatter_input.txt");
        File outFile = new File("./txt/QuotefFormatter_output.txt");

        try {
            Scanner input = new Scanner(inFile);
            PrintWriter output = new PrintWriter(outFile);
            while (input.hasNext()) {
                String word = input.nextLine();
                System.out.println(word); //debug
                String[] parts = word.split(" ");
                if (parts.length < 1) {
                    //write the person unchanged to file
                    output.write(word + "\n");
                } else if (parts.length == 2) {
                    String newWord = parts[0] + " " + parts[1];
                    //write that to the output file
                    output.write('"' + newWord + '"' + ",\n");
                    System.out.println();
                }    
                else {
                    String newWord = parts[0];
                    //write that to the output file
                    output.write('"' + newWord + '"' + ",\n");
                    System.out.println();
                }
            }
            input.close();
            output.close(); //Make sure output buffer is empty
        } catch (FileNotFoundException ex) {
            System.out.println("Couldn't open a file!");
            System.out.println();
        }
        System.out.println("Program complete!");
    }
}