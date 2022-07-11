/*
*  Ask user for an input file. 
* If it exists and is readable, 
* read the first three lines of it and print them to the screen.
*/
package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FirstThreeLines {
    public static void main(String[] args) {
        Scanner keyboardInput = new Scanner(System.in);

        System.out.print("Enter a file name to look at: ");
        String fileName = keyboardInput.nextLine();

        File inFile = new File(fileName);
        if (inFile.exists() && inFile.canRead()) {
            try {
                Scanner fileInput = new Scanner(inFile);
                int lineNumber = 0;
                while (fileInput.hasNext() && lineNumber < 3) {
                    String line = fileInput.nextLine();
                    System.out.printf("%d: %s\n", lineNumber, line);
                    lineNumber++;
                }
                fileInput.close();
            } catch (FileNotFoundException ex) {
                System.out.println("Cannot open the file!");
                System.out.println(ex);
            } 
        } else {
            System.out.println("File does not exist!");
        }
        keyboardInput.close();
    }
}    