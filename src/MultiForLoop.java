/*
 * Multi For Loop
 * Jason Vu - 6/24/2020
 * Doing two things in a loop initialization and continuation
 * 
 * Initialization: 
 * - i = 1
 * - j = 1
 * 
 * i < 4, so we do the loop body, and print 1 1 2
 * Continuation will add 1 to i and 2 to j, meaning i -> 2 and j -> 3
 * i < 4, we do the loop body and print 2 3 5
 * 
 * Continuation adds 1 to i and 2 to j, meaning i -> 3 and j -> 5 and so on
 */package src;

public class MultiForLoop {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i < 4; i++, j+=2) {
			System.out.printf("%d %d %d\n", i, j, i + j);
			j += 2;
		}
    }
}