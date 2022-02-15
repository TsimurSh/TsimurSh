package pl.tima.homework.homework28;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TimeAndDateFormatter {
    static DateTimeFormatter forma1 = DateTimeFormatter.ofPattern("hh:mm, dd/MM/YY");
    static DateTimeFormatter forma2 = DateTimeFormatter.ofPattern("YYYY, MMMM-dd !! hh:mm");


    public static void smena (LocalDateTime ldt1, LocalDateTime ldt2, Period per, Duration dur){
        if (ldt1.isBefore(ldt2)){
            System.out.println( "Работаеm с: " + forma1.format(ldt1));
            System.out.println( "До " + forma1.format(ldt1.plus(per)));
        }
        System.out.println( "Отдыхаем с " + forma2.format(ldt2));
        System.out.println( "До " + forma2.format(ldt2.plus(dur)));
    }

    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.of(2007, 8, 3, 18, 00);
        LocalDateTime dateTime2 = LocalDateTime.of(2008, 11, 30, 10, 45);
        Duration duration = Duration.ofHours(133);
        Period period = Period.ofDays(111);
        smena(dateTime1,dateTime2,period,duration);
    }
}
