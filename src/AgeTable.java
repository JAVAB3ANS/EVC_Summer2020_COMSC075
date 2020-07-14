package src;

/*
 * Age Table
 * Jason Vu - 6/23/2020
 * Long description
 */

public class AgeTable {
	public static void main(String[] args) {
		System.out.print("Years Days");
		int years = 1;
		while (years <= 10) {
			int days = years * 365;
			System.out.format("%2d	%5\n",years, days);
			years++;
		}
		System.out.println("The end. OK, bye thanks!");
	}
}
			
