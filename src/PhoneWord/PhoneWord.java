/*
 * Jason Vu - 7/1/2020
 * Phone Word
 * Description: Write a program named PhoneWord.java that prompts the  
 * user for a "phone word," an alphabetic mnemonic for a phone number.  
 * Then, print out the phone number corresponding to that sequence. 
 * You must accept letters in either upper or lower case. If the phone  
 * word translates to more than seven digits, keep only the first seven.  
 * If the phone word translates to fewer than seven digits, print an 
 * error message. Ignore any characters other than a letter or digit. 
 */package src;

import java.util.Scanner;

public class PhoneWord3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a phone word: ");
		String inputString = input.nextLine().toUpperCase(); //initialize string variable inputString 
		//converts input to uppercase always
		
		String phoneWordResult = "";
		int len = String.valueOf(inputString).length(); //gets length of user input

		for (int phoneWordIndex = 0; phoneWordIndex < 7; phoneWordIndex++) {
			char word = inputString.charAt(phoneWordIndex);
			if (phoneWordIndex == 3) { //will attach hyphen after the 3rd character every time
				phoneWordResult += '-';
			}
			if(word >= 'A' && word <= 'C' /*|| word > 'a' && word <= 'c'*/) { // lowercase values redundant
				phoneWordResult += '2'; // <- did this as opposed to doing phoneWord = phoneWord + '2' which is redundant as well
			} else if (word >= 'D' && word <= 'F' /*|| word > 'd' && word <= 'f'*/) {  
				phoneWordResult += '3';
			} else if (word >= 'G' && word <= 'I' /*|| word > 'g' && word <= 'i'*/) {  
				phoneWordResult +=  '4';
			} else if (word >= 'J' && word <= 'L' /*|| word > 'j' && word <= 'l'*/) {  
				phoneWordResult += '5';
			} else if (word >= 'M' && word <= 'O' /*|| word > 'm' && word <= 'o'*/) {  
				phoneWordResult += '6';
			} else if (word >= 'P' && word <= 'S' /*|| word > 'p' && word <= 's'*/) {  
				phoneWordResult += '7';
			} else if (word >= 'T' && word <= 'V' /*|| word > 't' && word <= 'v'*/) {  
				phoneWordResult += '8';
			} else if (word >= 'W' && word <= 'Z' /*|| word > 'w' && word <= 'z'*/) {  
				phoneWordResult += '9';
			} else if (word >= '0' && word <= '9') {	
				phoneWordResult += word;
			} else if (word >= '-') {
				phoneWordResult += "";
			} 
		}			
		if (len < 7) {
			System.out.println("\nYour word - " + inputString + " - was too short for a phone number!"); /*returns inputString input
			instead of result if user input is less than 7*/	
		} 
		System.out.println("\nYour phone number is: " + phoneWordResult);

	input.close();	
	}
	
}