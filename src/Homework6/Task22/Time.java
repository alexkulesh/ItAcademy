package homework6.task22;


public class Time{
    private int hour;
    private int minute;
    private int second;
    public Time(int sec){
        this.second = sec;
    }
    public Time(int hour1, int min1, int sec1){
        this.hour = hour1;
        this.minute = min1;
        this.second = sec1;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int returnFullTime(){
        return second + minute*60 + hour*3600;
    }
    public static void printTime(Time First){
        System.out.println(First.returnFullTime() + " second(-s)");
    }
    public static void compareTime(Time First, Time Second){
        if(First.returnFullTime() > Second.returnFullTime()){
            System.out.println("First time > Second time");
        }
        if(First.returnFullTime() == Second.returnFullTime()){
            System.out.println("First time = Second time");
        }
        if(First.returnFullTime() < Second.returnFullTime()){
            System.out.println("Second time > First time");
        }
    }
}
