package homework6.task22;

/**
 * Task 22. Create a class ana objects that describes time period. The period the in class
 * must be described with 3 features: seconds, minutes, hours. Create methods for receiving
 * full amount of seconds in the object, comparing two objects (method must work likewise
 * "compareTo" in the STRING). Create two constructors: one that receives all seconds, and
 * hours, minutes and seconds separately. Create method for data outputting. Other at your
 * discretion.
 */

public class Task22 {
    public static void main(String[] args) {
        Time time = new Time(36, 33, 1);
        Time time1 = new Time( 33, 33, 3);
        time.printTime();
        time1.printTime();
        Time.compareTime(time, time1);
    }
}
