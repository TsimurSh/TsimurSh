package pl.tima.homework.homework15;

public class DoWhileTime {

    public static void main(String[] args) {
        int hour = 0;
        int min = 0;
        int sec = 0;
        OUTER:
        while (hour < 6) {
            if (hour == 1 && min % 10 == 0) {
                break OUTER;
            }
            MIDLE:
            do { min++;
                INNER:
                while (sec < 60) {
                    System.out.println(hour + ":" + min + ":" + sec);
                    if (sec * hour > min) {
                        continue MIDLE;
                    }
                    sec++;
                }
            }
            while (min < 60);
            hour++;
        }
    }
}
