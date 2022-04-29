package pl.tima.lesson.lesson_28_LocalDateTime;


import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

public class DateFormatter {

    public static void main(String[] args) {
        Date date = new Date();
//        Timestamp timestamp = (Timestamp) date;
        System.out.println(date.toInstant());
        LocalDateTime dateTime = LocalDateTime.now();//(2002,9,4,12,56);
        LocalDateTime dateTime2 = LocalDateTime.of(2021, Month.FEBRUARY, 10 +
                3, 11, 19, 38,87556);
        System.out.println(dateTime2.format(DateTimeFormatter.ISO_WEEK_DATE));

        DateTimeFormatter format1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter format2 = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("d, MMMM, YYYY, hh:mm");
        LocalDateTime myFormat = LocalDateTime.parse("2013-04-15");
        System.out.println(format1.format(dateTime));
        System.out.println(format3.format(dateTime));
        System.out.println(myFormat.format(DateTimeFormatter.ISO_WEEK_DATE));

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