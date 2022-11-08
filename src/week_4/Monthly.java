package week_4;

public class Monthly extends Appointment{
    private int day;

    public Monthly(int year, int month, int day, String description) {
        super(year, month, day,description);
        this.day = day;
    }

    public boolean occursOn(int day){
        if (this.day == day){
            return true;
        }
        else {
            return false;
        }
    }

    public int getDay() {
        return day;
    }
}