public class Clock
{
    // instance variables
    private int hours;
    private int minutes;

    public void setHours(int newHours) {
        hours = newHours;
        if (hours < 0 || hours > 23) {
            hours = 0;
        }
    }

    public void setMinutes(int newMinutes) {
        minutes = newMinutes;
        if (minutes < 0 || minutes > 59) {
            minutes = 0;
        }
    }

    /**
    * Constructor for objects of class Clock
    */
    public Clock(int newHour, int newMinute)
    {
        if (newHour > 0 || newHour < 23) {
            this.hours = newHour;
        }
        else {
            setHours(hours);
        }
        if (newMinute > 0 || newMinute < 59) {
            this.minutes = newMinute;
        }
        else {
            setMinutes(minutes);
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public String toString() {
        return hours + ":"+minutes;
    }

    public void tick() {
        minutes = minutes +1;
        if(minutes >= 60) {
            hours++;
            minutes = 0;
        }
        if(hours >=24) {
            hours = 0;
        }
    }
}