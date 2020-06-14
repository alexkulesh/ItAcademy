package homework6.task22;


public class Time {
    private int second;
    private int minute;
    private int hour;

    public Time(int second, int minute, int hour) {
        if(second >= 60){
            minute = minute + second/60;
            second = second % 60;
        }
        if(minute >= 60){
            hour = minute / 60;
            minute = minute % 60;
        }
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }

    public Time(int second) {
        if(second >= 60){
            minute = minute + second/60;
            second = second % 60;
        }
        if(minute >= 60){
            hour = minute / 60;
            minute = minute % 60;
        }
        this.second = second;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int allSeconds() {
        return second + minute * 60 + hour * 3600;
    }

    public static void compareTime(Time time, Time time1) {
        if(time.allSeconds() > time1.allSeconds()){
            System.out.println("First time period is bigger than second");
        }
        if(time1.allSeconds() > time.allSeconds()){
            System.out.println("First time period is smaller than second");
        }
        if(time.allSeconds() == time1.allSeconds()){
            System.out.println("First time period equals second");
        }
    }
    public void printTime(){
        System.out.println("Time period in seconds - "  + allSeconds() + " second.");
        System.out.println("Time period displayed in hours, minutes and seconds - "  + getHour() + " hour " + getMinute() + " minute " + getSecond() + " second." );
    }
}
