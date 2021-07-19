package src;

import java.util.Scanner;

import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int computerPick = random.nextInt(3) + 1;
        String computerPlay = " ";
        
        String userPlay = userInput("Choose a move: rock, paper, or scissors: ", input);
        int userPlayLength = userPlay.length();

        String result = "";

        verifyInput(input, userPlayLength);
        
        switch(computerPick) {
            case 1:
                computerPlay = "rock";
                break;
            case 2:
                computerPlay = "paper";
                break;
            case 3:
                computerPlay = "scissors";
                break;
        }

        printResult(userPlay, computerPlay, result);

        input.close();
    }

    public static void verifyInput(Scanner input, int userPlayLength) {
        do {
            if(userPlayLength <= 0) {
                userInput("Choose a move: rock, paper, or scissors: ", input);
            }
        } while (userPlayLength <= 0);
    }

    public static String userInput(String prompt, Scanner input) {
        System.out.print(prompt);
        return input.nextLine().toLowerCase();
    }

    public static String getResult(String userPlay, String computerPlay, String result) {
        String decision = "";

        if (userPlay.equals(computerPlay)) {
            decision = "Tie!";
            result = decision;
        } else if (userPlay.equals("rock")) {
            if (computerPlay.equals("scissors")) {
                decision = "You win!";
                result = decision;
            } else if (computerPlay.equals("paper")) {
                decision = "Computer wins!";
                result = decision;
            }
        } else if (userPlay.equals("paper")) {
            if (computerPlay.equals("scissors")) {
                decision = "Computer wins!";
                result = decision;
            } else if (computerPlay.equals("rock")) {
                decision = "You win!";
                result = decision;
            }
        } else if (userPlay.equals("scissors")) {
            if (computerPlay.equals("paper")) {
                decision = "You win!";
                result = decision;
            } else if (computerPlay.equals("rock")) {
                decision = "Computer wins!";
                result = decision;
            }
        } else {
            System.out.println("Invalid user input."); 
        }

        return result;
    }

    public static void printResult(String userPlay, String computerPlay, String result) {
        System.out.println("");
        System.out.println("**Your Results**");
        System.out.println("User Choice: " + userPlay);
        System.out.println("Computer Choice: " + computerPlay);
        System.out.println("Winner: " + getResult(userPlay, computerPlay, result));
    }
}
