package src; 
/* import the necessary classes from java.io and java.util */

/*
 * Description of purpose of program goes here.
 * Make sure that it would be understandable to someone who has not
 * read the assignment.
 */


/*
 * The City class represents information about a city
 * using these private fields:
 *      the two-letter code for the city's country,
 *      the city name
 *      the city population
 * The class has:
 *      a three-argument constructor,
 *      a getter and setter for population
 *      getters for country code and city name (no setter)
 *      toString() method returning a String with
 *        the country, name, and population separated by semicolons
 */
 
//class City {
//}

//public class CityInfo {
    
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
    //public static ArrayList<City> readCityFile(String fileName) {
    //}
    
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
    /*public static int statistics(String countryCode, ArrayList<City> cityList) {
    }*/
    
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
     */ /*
    public static void writeCountryFile(String countryCode, ArrayList<City> cityList) {
    }
    
    public static void main(String[] args) {
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
    //} 
//}
 