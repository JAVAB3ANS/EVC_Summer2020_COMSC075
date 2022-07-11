/*
 * Short Title
 * Jason Vu - 6/24/2020
 * Run loop and skip over all members that are divisible by 3
 * This was written at the keyboard without planninng. 
 * Witness the result - it's pretty awful.
 */package src;
 
 public class ContinueExample {
	 public static void main(String[] args) {
		 int count = 0;
		 while (count <= 20) {
			 System.out.print("The number " + count + " ");
			 if (count++ % 3 == 0) { //this is totally ultra super ugly.
				 continue;
			 }
			 System.out.println("It is not divisible by 3!");
		 }
	 }
}
