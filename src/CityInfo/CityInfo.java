/*
 * Jason Vu - 7/21/2020
 * Description: In this project, you will write two classes: 
 * a class that represents information about a city and a main program that processes that information.
 * 
 * User will input two-letter country code and get its amount 
 * of cities and average population from a "citylist.dat" file
 */

package src;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.lang.NumberFormatException;
import java.io.IOException;
import java.io.PrintWriter;

class City {
    private String country;
    private String name;
    private int population;

    public City() {
        country = "";
        name = "";
        population = 0;
    }

    public City(String country, String name, int population) { //three-argument constructor
        this.country = country;
        this.name = name;
        this.population = population;
    }

    public String getCountry() {
        return country;
    }

    public String getName() {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String toString() {
        return String.format("Country Name: %s; City Name: %s; Population: %s", country, name, population);
    }
}

public class CityInfo {
        /*
        * Given a file name as a String, read the file with that name
        * and create an ArrayList of City objects corresponding to each
        * line in the file. The method returns the ArrayList.
        * 
        * Each line contains a two-letter country code, a city name,
        * and its population. These are separated by semicolons.
        * 
        * If a line in the file is invalid because it has too few
        * entries, too many entries, or a non-numeric population, print
        * an appropriate error message and skip that line (do not add
        * its information to the ArrayList.
        * 
        * If the file does not exist, print an appropriate error message
        * and return an empty ArrayList.
        * 
        */
    public static ArrayList<City> readCityFile(String fileName) {
        ArrayList<City> cityList = new ArrayList<City>();
        File cityFile = new File(fileName);
        try {
            Scanner inFile = new Scanner(cityFile);
            while (inFile.hasNextLine()) {
                String oneLine = inFile.nextLine();
                String[] info = oneLine.split(";");
                if (info.length != 3) {
                    System.out.printf("\"%s\" [does not have three entries!]\n", oneLine);
                } else {
                    try {
                        cityList.add(new City(info[0], info[1], Integer.valueOf(info[2])));
                    } catch (NumberFormatException ex) { //Catch NumberFormatException when reading the input file.
                        System.out.printf("\"%s\" [does not have a number on it.]\n", oneLine);
                        System.out.println(ex.getMessage());
                    } 
                }
            }
            inFile.close();
        } catch (FileNotFoundException ex) { //Catch FileNotFoundExceptionwhen opening a Scanner for the input file. 
            System.out.println("[Unable to open file named 'citylist.dat']");
            System.out.println(ex.getMessage());
        } catch (Exception ex) {
            System.out.printf("[Error processing %s. ]\n", fileName);
            System.out.println(ex.getMessage());
        }
        return cityList;
    }
        /*
        * Given a countryCode and a ArrayList of City objects,
        * calculate and print the total number of cities in that country
        * and the average population of those cities. Use the "%,.0f" format
        * to have the system round the average to an integer.
        * 
        * If no cities are in that country, print an appropriate error message.
        * 
        * This method returns the total number of cities.
        */
    public static int statistics(String name, ArrayList<City> cityList) {
        int numberCities = 0;
        int avgPopulation = 0;
        for (City c: cityList) {
            if (c.getCountry().equals(name)) {
                numberCities++;
                avgPopulation += c.getPopulation();
            }
        }
        if (numberCities > 0) {
            System.out.printf("Number of cities in %s: %d\n", name, numberCities);
            System.out.printf("Average population: %,.0f.\n", (double) avgPopulation / numberCities);
        } else {
            System.out.printf("[No cities found in %s.]\n", name);
            System.out.println();
        }
        return numberCities;
    }
            /*
        * Given a String countryCode and a ArrayList of City objects,
        * write a file with named CC.dat, where "CC" stands for the given
        * country code.
        * 
        * The output file will contain the information from the cities in
        * the given country. It will be in the same format as the original
        * city data file: country code, city name, and population, separated
        * by semicolons. Note: this is the format that the City.toString()
        * method returns.
        * 
        * If there is an exception while writing the file, this method prints
        * an appropriate error message.
        */
    public static void writeCountryFile(String countryCode, ArrayList<City> cityList) {
        String fileName = countryCode + ".dat";
        File cityFile = new File(fileName);
        try (PrintWriter output = new PrintWriter(cityFile)) {
            for (City c: cityList) {
                if (c.getCountry().equals(countryCode)) {
                    output.write(c.toString() + "\n");
                }
            }
            System.out.printf("File %s written successfully.\n", fileName);
            System.out.println();
        } catch (IOException ex) { //Catch IOException when writing an output file.
            System.out.printf("[Error writing %s]\n", fileName);
            System.out.println(ex.getMessage());
        }
    }
        /*
         * Read the "citylist.dat" file into cityList (an ArrayList<City>)
         * if (cityList has more than zero elements) {
         *      create a Scanner for user input;
         *      boolean finished = false;
         *      while (not finished) {
         *          prompt user for a country code or ENTER to quit;
         *          if (they entered a country code) {
         *              convert it to upper case;
         *              int nFound = statistics(countryCode, cityList);
         *              if (nFound > 0) {
         *                  write the country file for the given country code;
         *              }
         *          } else {
         *              finished = true;
         *          }
         *      }
         * }
         */
    public static void main(String[] args) {
        System.out.println("Reading city file...");
        ArrayList<City> cityList = readCityFile("./citylist.dat");
        if (cityList.size() > 0) {
            Scanner input = new Scanner(System.in);;
            boolean finished = false;
            System.out.println(); //print blank line for spacing

            while (!finished) {
                System.out.print("Enter a county code, or press ENTER to quit: ");
                String countryCode = input.nextLine();
                if (!"".equals(countryCode)) {
                    countryCode = countryCode.toUpperCase();
                    int nFound = statistics(countryCode, cityList);
                    if (nFound > 0) {
                        writeCountryFile(countryCode, cityList);
                    } 
                } else {
                    finished = true;
                }
            }
            input.close();
        }
    }
}
