package pl.tima.converter;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateFormatter {

    public static void main(String[] args) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date date = new Date();

            System.out.println(formatter.format(date));
        Calendar calendar = new GregorianCalendar();
            Date dateExe = calendar.getTime();
            Thread.currentThread(); // ждет в миллисекундах
        System.out.println(dateExe);
    }
}
