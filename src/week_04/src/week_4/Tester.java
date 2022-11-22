package week_4;

import java.util.ArrayList;
import java.util.Date;
public class Tester {
    public static void main(String[] args) {
        ArrayList<Appointment> arrayList = new ArrayList<>();
        Date date = new Date();
        int year = date.getYear() + 1900;

        Daily appointment1 = new Daily(year, date.getMonth(), date.getDate(), "A");
        Onetime appointment2 = new Onetime(2022,10,22, "B");
        Monthly appointment3 = new Monthly(year, date.getMonth(), 27, "C");
        Onetime appointment4 = new Onetime(2023,1,12, "B");
        Onetime appointment5 = new Onetime(2022,11,19, "B");
        Onetime appointment6 = new Onetime(2022,10,22, "B");


        arrayList.add(appointment1);
        arrayList.add(appointment2);
        arrayList.add(appointment3);
        arrayList.add(appointment4);
        arrayList.add(appointment5);
        arrayList.add(appointment6);

        for (Appointment appointment:arrayList){
            System.out.println(appointment.dayOfTheWeek());
            appointment.getDetails();
        }

        System.out.println("................");


        displayAll(arrayList);
    }

    public static void displayAll(ArrayList<Appointment> arrayList){
        //sort date
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j).getDate() > arrayList.get(j + 1).getDate()) {
                    Appointment temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        //sort month
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j).getMonth() > arrayList.get(j + 1).getMonth()) {
                    Appointment temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }
        //sort year
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i - 1; j++) {
                if (arrayList.get(j).getYear() > arrayList.get(j + 1).getYear()) {
                    // swap arr[j+1] and arr[j]
                    Appointment temp = arrayList.get(j);
                    arrayList.set(j, arrayList.get(j + 1));
                    arrayList.set(j + 1, temp);
                }
            }
        }

        for (Appointment appointment: arrayList) {
            appointment.getDetails();
        }
    }

}