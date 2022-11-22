package week_4;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Appointment {
    private String description;
    private int year;
    private int month;
    private int date;

    public Appointment(int year, int month, int date,String description) {
        this.year = year;
        this.month = month;
        this.date = date;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public String dayOfTheWeek(){
        String day = null;
        GregorianCalendar gregorianCalendar = new GregorianCalendar(year, month, date);
        int i = gregorianCalendar.get(Calendar.DAY_OF_WEEK);
        if(i == 2){
            day = "Mon";
        } else if (i==3){
            day = "Tue";
        } else if (i==4){
            day = "Wed";
        } else if (i==5){
            day = "Thu";
        } else if (i==6){
            day = "Fri";
        } else if (i==7){
            day = "Sat";
        } else if (i==1){
            day = "Sun";
        }
        return day;
    }

    public void getDetails(){
        System.out.println(year+" " + month+ " " + date + " " + description);
    }

    public int getYear() {
        return year;
    }

    public int getDate() {
        return date;
    }

    public int getMonth() {
        return month;
    }
}