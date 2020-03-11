package homework6.task22;

/**
 * Task 22. Create a class and objects that describe a period of time.
 * The period of time in the class itself must be set by three properties: seconds,
 * minutes, hours. Make methods for getting the total number of seconds
 * in an object, comparing two objects (the method should work similarly
 * to compareTo in strings). Create two constructors: receiving the total
 * number of seconds, and hours, minutes and seconds separately. Make
 * a method for outputting data. Other at your discretion.
 */
public class Task22 {

    public static void main(String[] args) {
        Time t1 = new Time(111);
        Time t2 = new Time(22, 22, 22);
        Time.printTime(t1);
        Time.printTime(t2);
        Time.compareTime(t1, t2);
    }
}


