package LeapYear10;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class LeapYear {
    public static void main(String[] args) {
        int number = 100;
        int year = Calendar.getInstance().get(Calendar.YEAR);


    for (int i = 1; i < number; i++ ){
      GregorianCalendar mycal = new GregorianCalendar((year+i), Calendar.FEBRUARY, 1);
        int daysInMonth= mycal.getActualMaximum(Calendar.DAY_OF_MONTH);
        if (daysInMonth ==29)
            System.out.println(year+i);
    }

    }



}
