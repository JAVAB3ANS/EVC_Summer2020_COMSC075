package src;

/*
 * Jason Vu - 6/24/2020
 * Display table showing age in days
 * for age in years from 1 to 10 (inclusive)
 * Use for loop to do this program.
 */

public class AgeTable2 {
	public static void main(String[] args) {
		System.out.println("Years Days");
		for (int year = 1; year <= 10; year++) {
			int days = year * 365;
			System.out.format("%2d	%5d\n", year, days);
		}
	}
}
