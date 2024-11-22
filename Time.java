package ja7.airplaneticketsreservation;

public class Time {
    
    private int hour;
    private int minute;

    public Time() {
    }

    public Time(int hour, int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int gethour() {
        return hour;
    }

    public void sethour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    @Override
    public String toString() {
        return hour + ":" + minute;
    }
}
