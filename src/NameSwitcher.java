package src;

import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;

public class NameSwitcher {
    public static void main(String[] args) {
        File inFile = new File("./txt/people.txt");
        File outFile = new File("./txt/switched_people.txt");

        try {
            Scanner input = new Scanner(inFile);
            PrintWriter output = new PrintWriter(outFile);
            while (input.hasNext()) {
                String person = input.nextLine();
                System.out.println(person); //debug
                String[] parts = person.split(" ");
                if (parts.length != 2) {
                    //write the person unchanged to file
                    output.write(person + "\n");
                } else {
                    String newPerson = parts[1] + ", " + parts[0];
                    //write that to the output file
                    output.write('"' + newPerson + '"' + '\n');
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