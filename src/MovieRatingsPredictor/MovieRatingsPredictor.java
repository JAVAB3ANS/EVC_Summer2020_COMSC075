///////////////////////////////////////////////////////////////////////////////
//                   ALL STUDENTS COMPLETE THESE SECTIONS
// Title:              TestMovieRatingsPredictor
// Files:              MovieRatingsPredictor.java
// Quarter:            CSE8B Spring 2020
//
// Author:             Taurean Zhang
// Email:              tyzhang@ucsd.edu
// Instructor's Name:  Adalbert Gerald Soosai Raj
//
//////////////////// PAIR PROGRAMMERS COMPLETE THIS SECTION ///////////////////
//
//                   CHECK ASSIGNMENT PAGE TO see IF PAIR-PROGRAMMING IS
//                   ALLOWED
//                   If pair programming is allowed:
//                   1. Read PAIR-PROGRAMMING policy (in CSE 8B syllabus)
//                   2. choose a partner wisely
//                   3. complete this section for each program file.
//
// Pair Partner:        Truong Pham
// Email:               gpham@ucsd.edu
// Instructors's Name:  Greg Miranda
// Lab Section:         C01
//
//////////////////// STUDENTS WHO GET HELP FROM OTHER THAN THEIR PARTNER //////
//                   must fully acknowledge and credit those sources of help.
//                   Instructors and TAs do not have to be credited here,
//                   but roommates, relatives, strangers, etc do.
//
// Persons:          Identify persons by name, relationship to you, and email.
//                   Describe in detail the the ideas and help they provided.
//
// Online sources:
// https://www.geeksforgeeks.org/conversion-of-array-to-arraylist-in-java/
//////////////////////////// 80 columns wide //////////////////////////////////
package src;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

/**
 * This class represents a movie rating predictor.
 *
 * Bugs: (a list of bugs and other problems)
 *
 * @author Taurean Zhang and Truong Pham
 */
public class MovieRatingsPredictor {

    public static void main(String[] args) {
        
    }

    public static final String SPACE_DELIMITER = " ";
    public static final String SPACE_HEADER = " ";
    public static final int DEFAULT_RATING = 2;
    public static final int RATING_ARRAY_SIZE = 2;
    HashMap<String, Integer[]> wordValue;
    HashSet<String> stopWords;

    /**
     * No-Args Constructor for a MovieRatingsPredictor
     */
    public MovieRatingsPredictor() {
        stopWords = new HashSet<>();
        wordValue = new HashMap<>();
    }

    /**
     * Obtains the unique stop words from stopWordsFile and adds it to the set
     *
     * @param stopWordsFile A file name that contains the stop words
     * @return The number of unique stop words added to the set
     * @throws FileNotFoundException
     */
    public int fillStopWords(String stopWordsFile)
            throws FileNotFoundException {
        //Checking file name
        if (stopWordsFile == null || stopWordsFile == "")
            return 0;
        Scanner inputFile = new Scanner(new File(stopWordsFile));
        //Checking if the file is empty
        if (!inputFile.hasNextLine())
            return 0;
        else{
            int numofStopWords = 0;
            while(inputFile.hasNextLine()){
                String stopWord = inputFile.nextLine();
                //Adding new stopWords
                if (!this.stopWords.contains(stopWord)){
                    this.stopWords.add(stopWord);
                    numofStopWords++;
                }
            }
            return numofStopWords;
        }
    }

    /**
     * Reads the reviews in reviewsFile and stores them into an
     * ArrayList<ArrayList <String>>
     *
     * @param reviewsFile The file name that contains the reviews
     * @return ArrayList representation of the reviews
     * @throws FileNotFoundException
     */
    public ArrayList<ArrayList<String>> readReviewsFromFile(
            String reviewsFile) throws FileNotFoundException {
        if (reviewsFile == null || reviewsFile == "")
            return null;
        Scanner inputFile = new Scanner(new File(reviewsFile));
        ArrayList<ArrayList<String>> formattedReviews = new ArrayList<>();
        //Check if reviewFiles is empty
        if (!inputFile.hasNextLine())
            return formattedReviews;
        while (inputFile.hasNext()) {
            String lineData = inputFile.nextLine().toLowerCase();
            //Creates and adds a formatted single review
            ArrayList<String> singleReview =
                new ArrayList<String>(Arrays.asList
                (lineData.split(SPACE_DELIMITER)));
            formattedReviews.add(singleReview);
        }
        return formattedReviews;
    }

    /**
     * Removes the stop words from the ArrayList of reviews.
     *
     * @param rawData the ArrayList representation of reviews
     * @return ArrayList representation of reviews with stop words removed
     */
    public ArrayList<ArrayList<String>> removeStopWords(
            ArrayList<ArrayList<String>> rawData) {
        //Checks if rawData is null
        if(rawData == null){
            return null;
        }
        //Checks if rawData is empty
        if(rawData.size() == 0){
            return rawData;
        }
        for(int i = 0; i < rawData.size(); i++){
            for(int j = 0; j < rawData.get(i).size(); j++){
                //Checks for stop words and removes them
                if(this.stopWords.contains(rawData.get(i).get(j))){
                    rawData.get(i).remove(j);
                    j--;
                }
            }
        }
        return rawData;
    }

    /**
     * Populates the wordValue HashMap with key String and Integer[] with
     * the format [totalRating, count].
     *
     * @param cleanReviewRatings ArrayList representation of reviews
     * @return The number of words (with value) in the wordValue HashMap
     */
    public int updateHashMap(ArrayList<ArrayList<String>> cleanReviewRatings){
        int uniqueWords = 0;
        //Chekcs if cleanReviewRatings is null or empty
        if(cleanReviewRatings == null || cleanReviewRatings.size() == 0){
            return 0;
        }
        for(int i = 0; i < cleanReviewRatings.size(); i++){
            for(int j = 1; j < cleanReviewRatings.get(i).size();j++){
                //Checks if key is already contained in wordValue
                String key = cleanReviewRatings.get(i).get(j);
                if (wordValue.containsKey(key)){
                    //Updates entry in wordValue
                    Integer[] updateRatings = {wordValue.get(key)[0] +
                         Integer.parseInt(cleanReviewRatings.get(i).get(0))
                         , wordValue.get(key)[1] + 1};
                                wordValue.put(key, updateRatings);
                }
                //If key is not contained in wordValue,
                //create a new key and rating and adds to unique word count
                else {
                    uniqueWords++;
                    Integer[] newRatings = {Integer.parseInt
                        (cleanReviewRatings.get(i).get(((Integer) 0))), 1};
                    wordValue.put(key, newRatings);
                }
            }
        }
        return uniqueWords;
    }

    /**
     * Rates each review and adds the rating at the beginning of the ArrayList
     *
     * @param cleanReviews ArrayList representation of reviews
     * @return ArrayList representation of reviews with ratings
     */
    public ArrayList<ArrayList<String>> rateReviews(
            ArrayList<ArrayList<String>> cleanReviews) {
        //Check if cleanReviews is null
        if (cleanReviews == null)
            return null;
        //Checks if cleanReviews is empty
        if (cleanReviews.size() == 0)
            return cleanReviews;
        Integer [] wordValues = new Integer[RATING_ARRAY_SIZE];
        double total = 0;
        double numofEntries = 0;
        for (int i = 0; i < cleanReviews.size(); i++) {
            for (int j = 0; j < cleanReviews.get(i).size(); j++) {
                if (wordValue.get(cleanReviews.get(i).get(j)) == null){
                    //If rating is null, set to the DEFAULT_RATING
                    wordValues[0] = DEFAULT_RATING;
                    wordValues[1] = 1;
                }
                else
                    wordValues =
                        wordValue.get(cleanReviews.get(i).get(j));
                    //From rating, adds to total and the number of entries
                    total += ((double) wordValues[0]) / wordValues[1];
                    numofEntries++;
            }
            //Adds rating to review and resets the total and number of entries
            cleanReviews.get(i).add(0, String.valueOf(Math.round
                (total/numofEntries)));
            total = 0;
            numofEntries = 0;
        }
        return cleanReviews;
    }

    /**
     * Writes reviews to a file
     *
     * @param cleanReviewsWithRatings The ArrayList representation of reviews
     * @param outputFile The file to write to
     * @return The number of reviews with ratings written to the file
     * @throws FileNotFoundException
     */
    public int writeReviewsToFile(
            ArrayList<ArrayList<String>> cleanReviewsWithRatings,
            String outputFile) throws FileNotFoundException {
        //Checks if cleanReviewsWithRatings is empty or null
        if (cleanReviewsWithRatings.size() == 0 ||
            cleanReviewsWithRatings == null)
            return 0;
        //Chekcs if the outputFile is null or empty
        if (outputFile == null || outputFile == "")
            return 0;
        PrintWriter output = new PrintWriter(outputFile);
        //Formats and prints out cleanReviewsWithRatings
        for (int i = 0; i < cleanReviewsWithRatings.size(); i++) {
            for (int j = 0; j < cleanReviewsWithRatings.get(i).size(); j++) {
                //Prints SPACE_HEADER except for the last value in the array
                if (j != cleanReviewsWithRatings.get(i).size() - 1)
                    output.print(cleanReviewsWithRatings.get(i).get(j) +
                    SPACE_HEADER);
                else
                    output.print(cleanReviewsWithRatings.get(i).get(j));
            }
            //Puts in a new line for every line expect in the last line
            if (i != cleanReviewsWithRatings.size() - 1)
                output.println();
        }
        output.close();
        return cleanReviewsWithRatings.size();
    }
}
