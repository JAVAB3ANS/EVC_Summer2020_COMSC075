/*
 * Average of a week's temperatures
 * J D Eisenberg, 1 Jul 2020
 * Takes an array of Celsius temperatures and
 * converts them to Fahrenheit and displays them.
 */package src;


public class WeatherArr5Solved {
    
    public static double[] convertToFahrenheit(double[] temps) {
        // F = (C / 5) * 9 + 32
        double[] result = new double[temps.length];
        
        for (int i = 0; i < temps.length; i++) {
            result[i] = (temps[i] / 5.0) * 9.0 + 32.0;
        }
        return result;
    }
    
    
    public static void main(String[] args) {
      
        double[] celsiusTemperatures = {27.2, 20.0, 20.4, 21.5, 22.8, 20.7, 26.9,
            25.4, 28.1, 22.0, 22.6, 23.1, 25.1, 26.7};
        
        double[] fahrenheitTemperatures = convertToFahrenheit(celsiusTemperatures);
        
        System.out.println("Here are the Celsius temperatures: ");
        displayArray(celsiusTemperatures);
        
        System.out.println("Here are your temperatures in \u00b0 F:");
        displayArray(fahrenheitTemperatures);

    }
    
    public static void displayArray(double[] list) {
        final int PER_LINE = 10;
        int counter = 0;
        for (int index = 0; index < list.length; index++) {
            System.out.printf("%.1f ", list[index]);
            counter++;
            if (counter == PER_LINE) {
                System.out.println();
                counter = 0;
            }
        }
        if (counter != 0) {
            System.out.println();
        }
        
    }
}
