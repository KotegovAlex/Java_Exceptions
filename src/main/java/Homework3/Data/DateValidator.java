package Homework3.Data;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateValidator {
    public static void dateIsValid(String inputDate) throws ParseException {
        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        format.setLenient(false);
        calendar.setTime(format.parse(inputDate));
    }
}
