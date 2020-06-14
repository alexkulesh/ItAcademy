package homework;

/**
 * Task 2. There is a time interval in seconds. Display it
 * in the form of weeks, days, hours, minutes and seconds.
 */
public class Task2 {
    public static void main(String[] args) {
        int s = 1113700;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int hour = h % 24;
        int d = (h - hour) / 24;
        int day = d % 7;
        int w = (d - day)/7;
        System.out.println(w + " week " + day + " day " +  hour + " hour " + min + " minute " + sec + " second ");
    }
}
