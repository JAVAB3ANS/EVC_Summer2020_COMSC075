/*
 * Great Circle Distance
 * Jason Vu
 * 
 * User enters (lat1, lon1) and (lat2, lon2) which are the
 * latitude and longitude of two points on earth.
 * 
 * The program calculates and displays the great 
 * circle distance between the points in km, based
 * on this formula:
 * 
 * r sin(lat2) + cos(lat1) cos(lon 1 - lon2)
 * 
 * where r is the radius of the earth: 6371.01 km
 * 
 * Here are some latitudes and longitudes you can use:
 *  
 * San Jose: 37.338, -121.886
 * Los Angeles: 34.052, -118.244
 * Seoul, South Korea: 37.566, 127.0
 * Paris, France: 48.8667,2.3333* 
 * You can check your answers at this web site:
 * https://www.gpsvisualizer.com/calculators* 
 * 
 * (The numbers may not match exactly, but they should be close.)
 */

package src;

import java.util.Scanner;

public class GreatCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter latitude and longitude of city 1 in \u00b0: ");
        double lat1 = input.nextDouble();
        double lon1 = input.nextDouble();

        System.out.print("Enter latitude and longitude of city 2 in \u00b0: ");
        double lat2 = input.nextDouble();
        double lon2 = input.nextDouble();

        final double RADIUS = 6371.01; // radius of earth in km.
        
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);

        double distance = RADIUS * Math.acos(
            Math.sin(lat1) * Math.sin(lat2) + 
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
        
        System.out.format("The great circle distance is %.3f km.\n", distance);

        input.close();
    }
}