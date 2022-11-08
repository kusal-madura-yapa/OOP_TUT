package week_4;
import java.util.Date;

public class Daily extends Appointment{

    public Daily(int year, int month, int day, String description) {
        super(year, month, day, description);
    }

    public boolean occursOn(){
        return true;
    }
}