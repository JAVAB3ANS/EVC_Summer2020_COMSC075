package src;

class Reservation {
    String room;
    int day;
    static int nReservations = 0;
    static final String[] dayName = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

    Reservation (String newRoom, int newDay) {
        room = newRoom;
        day = newDay;
        nReservations++;
    }
    /*
     * This instance method can reference both an instance property (room)
     * and a static property (dayName)
     */
    void show() {
        System.out.printf("Room %s reserved on %s.\n", room, dayName[day]);
    }
    /*
     * Move reservation back n days
     * For example, if it was reserved for Monday and you want to move
     * the reservation back two days to Wednesday, call moveBack(2)
     */
    void moveBack(int nDays) {
        day = (day + nDays) % 7;
    }

    static void showNReservations() {
        System.out.printf("Number of reservations created is: %d.\n", nReservations);
    }
}

public class TestReservation {
    public static void main(String[] args) {
        Reservation r1 = new Reservation("SA114", 0);
        Reservation r2 = new Reservation("RF241", 3);

        r1.moveBack(2);
        r1.show();
        r2.show();

        //When invoking static methods, you use the
        // name of the class , not the name of an instance
        // You could use an instance name but everyone would
        // look at you funny.)
        Reservation.showNReservations();
    }
}