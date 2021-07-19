/*
 * Average of a week's temperatures
 * <your name> <date>
 * Calculate the average temperature of two weeks worth of
 * maximum temperatures in degrees Celsius.
 */package src;


 public class WeatherArr4 {
    public static void main(String[] args) {
      
        double[] days = {27.2, 20.0, 20.4, 21.5, 22.8, 20.7, 26.9,
            25.4, 28.1, 22.0, 22.6, 23.1, 25.1, 26.7};
        
        double sum = 0;
        for (int index = 0; index < days.length; index++) {
            sum = sum + days[index];
        }
        
        double average = sum / days.length;
        
        System.out.printf("The average temperature over %d days is %.1f\u00b0C.\n",
            days.length, average);

    }
}
