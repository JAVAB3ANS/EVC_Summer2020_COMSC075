/* 
 * Copy Array 1
 * Jason Vu - 6/30/20
 * Because arrays are reference types, when you assign one array
 * to another, they will both refer to the same area of memory.
 * 
 * If you want a true copy, you can run a loop to create a brand new array.
 */package src;
 
 public class CopyArray1 {
	 public static void main(String[] args) {
		int[] arrayA = {100, 101, 102, 103, 104, 105};
		int[] arrayB = arrayA; //shared reference
		int[] arrayC = new int[arrayA.length]; //reference to brand new area of memory
		
		for (int i = 0; i < arrayA.length; i++) {
			arrayC[i] = arrayA[i];
		}
		
		arrayA[0] = 999; //this will change arrayB, but not arrayC
		
		System.out.printf("arrayA[0] is %d\n", arrayA[0]);
		System.out.printf("arrayB[0] is %d\n", arrayB[0]);
		System.out.printf("arrayC[0] is %d\n", arrayC[0]);
	 }
}
