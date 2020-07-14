package src;

public class SummationMethod{
	public static int sumRange(int m, int n) {
		int sum = 0;
		for (int i = m ; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	public static void main(String[] args) {
		int x = sumRange(0, 4);
		int y = sumRange(7, 10);
		int z = sumRange(39, 42);
		
		System.out.println("Sum from 0 to 4 is " + x);
		System.out.println("Sum from 7 to 10 is " + y);
		System.out.println("Sum from 39 to 42 is " + z);
	}
}
