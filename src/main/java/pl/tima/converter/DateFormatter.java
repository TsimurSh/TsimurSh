package pl.tima.converter;


import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatter {

    public static void main(String[] args) {
        Date date = new Date();
        LocalDateTime dateTime = LocalDateTime.now();//(2002,9,4,12,56);
        LocalDateTime dateTimePee = LocalDateTime.of(2021, Month.FEBRUARY, 10 +
                3, 14, 99, 345678);
        DateTimeFormatter format1 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(dateTime.format(DateTimeFormatter.ISO_WEEK_DATE));

//        SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
//        System.out.println(formatter.format(date));
//
//        GregorianCalendar cannes = new GregorianCalendar(216, 07, 22);
//        cannes.set(Calendar.ERA, BC);
//        DateFormat dtCannes = new SimpleDateFormat("dd MMM YYY GG");
//        System.out.println(dtCannes.format(cannes.getTime()));
//
//        Calendar calendar = new GregorianCalendar();
//        calendar.set(Calendar.ERA, BC);
//
//        TimeZone dateExe = calendar.getTimeZone();
////            Thread.currentThread(); // ждет в миллисекундах
//        System.out.println(dateExe);
//
//        String strDate = "Sat, April 8, 2020";
//        SimpleDateFormat formatter1 = new SimpleDateFormat("EEE, MMMM d, yyyy", Locale.ENGLISH);
//        Date date2 = null;
    }
}