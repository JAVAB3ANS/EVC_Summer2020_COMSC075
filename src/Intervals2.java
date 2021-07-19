/*
 * Intervals
 * Jason Vu - 6/24/2020
 * Write a program named Intervals.java that will take two time 
 * intervals (a starting and ending time) and compare them. The 
 * program first prompts the user for an earlier and later interval. 
 * Each interval consists of two numbers  in 24-hour format 
 * (for example, 1507  for  3:07 p.m.)
 */package src;

import java.util.Scanner;

public class Intervals2 {
	public static void main(String[] args) {
		/*Hint: One method to make the calculation easier is to convert 
		 * the times to number of minutes after midnight.  For example, 
		 * 0507 is 5 hours and 7 minutes past midnight, or 307 minutes 
		 * past midnight. You will want to use / and % with 100 to split 
		 * up the time into the hours and minutes part, but use 60 when 
		 * calculating total minutes!*/
		 
		//input and initialization of variables
		Scanner input = new Scanner(System.in);
		System.out.print("Enter earlier start and end time as two 24-hour format times: ");
		double earlierStartTime = input.nextDouble();
		double earlierEndTime = input.nextDouble();
		System.out.print("Enter later start and end time as two 24-hour format times: ");
		double laterStartTime = input.nextDouble();
		double laterEndTime = input.nextDouble();
		
		//processing
		double MAMofEarlierStartTime = ((earlierStartTime/100) * 60) + (earlierStartTime % 100); //MAM = minutes after midnight
		double MAMofEarlierEndTime = ((earlierEndTime/100) * 60) + (earlierStartTime % 100);
		double earlierInteger = MAMofEarlierEndTime - MAMofEarlierStartTime;
		
		double MAMofLaterStartTime = ((laterStartTime/100) * 60) + (laterStartTime % 100);
		double MAMofLaterEndTime = ((laterEndTime/100) * 60) + (laterStartTime % 100);
		double laterInteger = MAMofLaterEndTime - MAMofLaterStartTime;
		
		//output intervals
		System.out.format("The earlier interval is %.2f minutes long.\n", earlierInteger);
		System.out.format("The later interval is %.2f minutes long.\n", laterInteger);
		
		//determine if intervals are longer or of equal length
		if (earlierInteger < laterInteger) {
			System.out.println("The later interval is longer!"); 
		} else if (earlierInteger > laterInteger) {
			System.out.println("The earlier interval is longer!");
		} else {
			System.out.println("They are equally long!");
		}
		
		input.close();
	}
}
