package pl.tima.homework.homework15;

public class DoWhileTime {

    public static void main(String[] args) {
        int hour =0;
        OUTER:
        while (hour < 6) {
            int min = 0;
            int sec = 0;
            MIDLE:
            do {
                INNER:
                while (sec < 60) {
                    System.out.println(hour + ":" + min + ":" + sec);
                    sec++;
                }
            min++;
            }
            while (min < 60);
        }
        hour++;
    }
}
