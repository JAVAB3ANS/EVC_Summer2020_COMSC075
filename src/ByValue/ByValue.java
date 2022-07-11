/*
 * By Value
 * Jason Vu - 6/25/2020
 * This program shows that the arguments are *copied* into the
 * parameters. You can modify the parameters as much as you want.
 * and it will *NEVER* modify the argument.
 */package src;
 
 public class ByValue {
	public static void main(String[] args) {
		int n = 5; 
		int result = doStuff(n);
		System.out.println("After call, result is " + result + " and n is " + n);
	}
	
	public static int doStuff(int n) {
		System.out.println("At start of doStuff, x is " + n);
		n = n * 3 + 7;
		System.out.println("At end of doStuff, x is " + n);
		return n;
	}
}
