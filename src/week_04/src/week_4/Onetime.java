package week_4;

public class Onetime extends Appointment {
    private int year;
    private int month;
    private int day;


    public Onetime(int year, int month, int day,String description) {
        super(year, month, day,description);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public boolean occursOn(int year, int month, int day){
        if (this.year == year && this.month == month && this.day == day){
            return true;
        }
        else {
            return false;
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}