/*
 * You are given a file named courselist.dat that contains
 * data about school courses in this format:
 * 
 * ACCTG:Beginning Accounting:20
 * COMSC:Java Programming:49
 * COMSC:C++ Programming:55
 * 
 * where each line consists of a subject name, course title, and 
 * number of hours of instruction, separated by colons.
 * 
 * This program will read the course data in to an ArrayList. If there is
 * bad data in the file, the program reports it.
 * 
 * After the data is read, the program will then repeatedly prompt
 * the user for a subject name. If the ArrayList contains
 * courses with the subject name, the program will:
 * 
 * 1) Print the total number of courses in that subject
 * 2) Print the average number of hours of instruction in that subject
 * 3) Write a file with the name of the subject as part of the file name.
 *    This file will contain the course information for the courses in
 *    that subject.
 * 
 * Here is a sample run of the program.
 * ======================================
Reading course file...
"SHORT:not enough entries" does not have three entries.
"LONG:too many entries:55:79" does not have three entries.
"BAD:Non-number on line:twelve" does not have a number on it.

Enter a subject name, or press ENTER to quit: ECON
No courses found in ECON.
Enter a subject name, or press ENTER to quit: math
Number of courses in MATH: 3
Average numberof hours is 42.
File MATH.dat written successfully.
Enter a subject name, or press ENTER to quit:
 * ======================================
 *
 * If you look in file MATH.dat, you will see this:
 * 
 * ======================================
MATH:Statistics:45
MATH:Pre-calculus:40
MATH:Advanced Algebra:40
 * ======================================
 */

package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.PrintWriter;

/*
 * A course is described by the subject,
 * the course title, and the number of hours of instruction.
 */
 
class Course {
    private String subject;
    private String title;
    private int hours;

    public Course() {
      subject = "";
      title = "";
      hours = 0;
    }

    public Course(String subject, String title, int hours) {
        this.subject = subject;
        this.title = title;
        this.hours = hours;
    }

    public String toString() {
        return String.format("%s:%s:%d", subject, title, hours);
    }

    public String getSubject() {
        return subject;
    }

    public String getTitle() {
        return title;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
}

public class CourseInfo {
    
    /*
     * Given a file name as a String, read the file with that name
     * and create an ArrayList of Course objects corresponding to each
     * line in the file. The method returns the ArrayList.
     * 
     * Each line contains a subject, a description, and the number of
     * hours of instruction. These are separated by colons.
     * 
     * If a line in the file is invalid because it has too few
     * entries, too many entries, or a non-numeric number of hours, print
     * an appropriate error message and skip that line (do not add
     * its information to the ArrayList.
     * 
     * If the file does not exist, print an appropriate error message
     * and return an empty ArrayList.
     * 
     */
    public static ArrayList<Course> readCourseFile(String fileName) {
        ArrayList<Course> result = new ArrayList<Course>();
        File f = new File(fileName);
        
        try {
            Scanner inFile = new Scanner(f);
            while (inFile.hasNextLine()) {
                String oneLine = inFile.nextLine();
                String[] info = oneLine.split(":");
                if (info.length != 3) {
                    System.out.printf("\"%s\" does not have three entries.\n",
                        oneLine);
                } else {
                    try {
                        result.add(new Course(info[0], info[1], Integer.valueOf(info[2])));
                    }
                    catch (NumberFormatException ex) {
                        System.out.printf("\"%s\" does not have a number on it.\n", oneLine);
                        System.out.println(ex.getMessage());
                    }
                }
            }
            inFile.close();
        }
        catch (FileNotFoundException ex) {
            System.out.printf("Cannot open file %s.\n", fileName);
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.printf("Error processing %s.\n", fileName);
            System.out.println(ex.getMessage());
        }
        return result;
    }
    
    /*
     * Given a subjecctName and a ArrayList of Course objects,
     * calculate and print the total number of courses in that subject
     * and the average numberof hours of instruction for those courses.
     * Use the "%,.0f" format to have the system round the average to an integer.
     * 
     * If no courses are in that subject, print an appropriate error message.
     * 
     * This method returns the total number of courses.
     */
    public static int statistics(String subjectName, ArrayList<Course> courseList) {
        int totalCourses = 0;
        int totalHours = 0;
        for (Course c: courseList) {
            if (c.getSubject().equals(subjectName)) {
                totalCourses++;
                totalHours += c.getHours();
            }
        }
        if (totalCourses > 0) {
            System.out.printf("Number of courses in %s: %d\n",
                subjectName, totalCourses);
            System.out.printf("Average number of hours is %,.0f.\n",
                (double) totalHours / totalCourses);
        } else {
            System.out.printf("No courses found in %s.\n", subjectName);
            System.out.println();
        }
        return totalCourses;
    }
    
    /*
     * Given a String subjectName and a ArrayList of Course objects,
     * write a file with named CCCC.dat, where "CCCC" stands for the given
     * subject name.
     * 
     * The output file will contain the information from the courses in
     * the given subjecct. It will be in the same format as the original
     * course data file: subject name, course title, and number of hours,
     * separated by colons. Note: this is the format that the
     * Course.toString() method returns.
     * 
     * If there is an exception while writing the file, this method prints
     * an appropriate error message.
     */
    public static void writeSubjectFile(String subjectName, ArrayList<Course> courseList) {
        String fileName = subjectName + ".dat";
        File f = new File(fileName);
        try (PrintWriter output = new PrintWriter(f)) {
            for (Course c: courseList) {
                if (c.getSubject().equals(subjectName)) {
                    output.write(c.toString() + "\n");
                }
            }
            System.out.printf("File %s written successfully.\n", fileName);
            System.out.println();
        }
        catch (IOException ex) {
            System.out.printf("Error writing %s\n", fileName);
            System.out.println(ex.getMessage());
        }
    }
    
    public static void main(String[] args) {
        /*
         * Read the "courselist.dat" file into courseList (an ArrayList<Course>)
         * if (courseList has more than zero elements) {
         *      create a Scanner for user input;
         *      boolean finished = true;
         *      while (not finished) {
         *          prompt user for a subject name or ENTER to quit;
         *          if (they entered a subject name) {
         *              convert it to upper case;
         *              int nFound = statistics(subjectName, courseList);
         *              if (nFound > 0) {
         *                  write the course file for the given subject name;
         *              }
         *          } else {
         *              finished = true;
         *          }
         *      }
         * }
         */
        System.out.println("Reading course file...");
        ArrayList<Course> courseList = readCourseFile("./courselist.dat");

        if (courseList.size() > 0) {
            Scanner input = new Scanner(System.in);
            boolean finished = false;
            System.out.println(); // print a blank line for spacing
            
            while (!finished) {
                System.out.print("Enter a subject name, or press ENTER to quit: ");
                String subjectName = input.nextLine();
                if (!"".equals(subjectName)) {
                    subjectName = subjectName.toUpperCase();
                    int nFound = statistics(subjectName, courseList);
                    if (nFound > 0) {
                        writeSubjectFile(subjectName, courseList);
                    }
                } else {
                    finished = true;
                }
            }
            input.close();
        }
    }
}
