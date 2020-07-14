/* Jason Vu
 * Locker Puzzle
 * Description: Your program must use an array of 
 * 100 boolean elements, each of which indicates 
 * whether a locker is open (true) or closed (false). 
 * Initially, all lockers are closed. You do not need 
 * to write a special case for students S1 and S2. 
 * Student S1 is changing the status of every locker 
 * starting with L1, and S2 is changing the status of 
 * every second locker starting with L2.
 * 
 * 
 * After the loop is done and the final array is complete, got through
 * the array and look for True values as those are the ones that are open.
 * Once you find an index where the value is True, add 1 to it so it represents the actual locker and print it.
 */package src;

public class LockerPuzzle {
    public static void main(String[] args) {
        boolean[] openedLockers = new boolean[101]; //set boolean variable to openedLockers so that the true=open, false=closed convention is self-documented.
        //Open all multiples of 1 before moving on to 2
        for (int studentNumber = 1; studentNumber < openedLockers.length; studentNumber++) {
            openedLockers[studentNumber] = true;
        }

        //open every locker for every multiple of i
        for (int studentNumber = 2; studentNumber <= 100; studentNumber++) {
            for (int j = 1; studentNumber * j <= 100; j++) {
                openedLockers[studentNumber * j] = !openedLockers[studentNumber * j]; //only options will be true or false
            }
        }

        System.out.println("Here are all the open lockers:");

        //Display the indices of the open lockers
        for (int studentNumber = 1; studentNumber < openedLockers.length; studentNumber++) {
            if (openedLockers[studentNumber]) { //assumes that openedLockers[i] is true or opened in this case
                System.out.print(studentNumber + " ");
                System.out.print("\n");
            }
        }
    }
}