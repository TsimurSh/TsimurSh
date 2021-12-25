package pl.tima.converter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    public static void main(String[] args) {
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date date = new Date();

            System.out.println(formatter.format(date));
        }
    }
}
