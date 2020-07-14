/*
 * Average of week's temperature
 * Jason Vu - 6/30/20
 * Calculate the average temperature of a week's 
 * maximum temperatures in degrees Celsius.
 */package src;

 
 public class Weather {
	 public static void main(String[] args) {
		/*double[] day = double[7]; //seven items, numbered 0 through 6
		day[0] = 27.2;
		day[1] = 20.0;
		day[2] = 20.4;
		day[3] = 21.5;
		day[4] = 22.8;
		day[5] = 20.7;
		day[6] = 26.9;*/	
		
		double[] day = {27.2, 20.0, 20.4, 21.5, 22.8, 20.7, 26.9,
			25.4, 28.1, 22.0, 22.6, 23.1, 25.1, 26.7};
		
		double sum = 0;
		for (int index = 0; index < day.length; index++) {
			sum = sum + day[index];
		}
		
		double average = sum/day.length; // use day.length instead of 14 days to denote two weeks
		
		
		/*double average = (day[0] + day[1] + day[2] + day[3] + day[4] +
		day[5] + day[6]) / 7;*/
		
		System.out.printf("The average temperature over %d days is %.1f\u00b0c.\n", 
		day.length, average);  //day.length denotes how many items I have in the array
	}
}
