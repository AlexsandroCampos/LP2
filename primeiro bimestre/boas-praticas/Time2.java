public class Time2 {
    private int hour;
    private int minute;
    private int second;

    public Time2() {
        this(0,0,0);
    }

    public Time2(int h) {
        this(h,0,0);
    }

    public Time2(int h, int m, int s) {
        setTime(h,m,s);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }
    
    public int getSecond() {
        return second;
    }

    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }

    public void setHour(int h) {
        this.hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) {
        this.minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) {
        this.second = ((s >= 0 && s < 60) ? s : 0);
    }
}
