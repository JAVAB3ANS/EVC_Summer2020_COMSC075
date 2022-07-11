package src;

class Duration {
    public int minutes;
    public int seconds;

    Duration(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }
}

public class TestDuration {   
    public static void main(String[] args) {      
        Duration d = new Duration(3, 15);      
        d = addOneMinute(d);      
        System.out.println(d.minutes + ":" + d.seconds);   
    }   
    
    public static Duration addOneMinute(Duration d) {      
        // creates a new object, different from original d      
        d = new Duration(d.minutes + 1, d.seconds);      
        return d;   
    }
}