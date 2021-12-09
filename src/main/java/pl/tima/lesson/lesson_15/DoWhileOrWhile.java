package pl.tima.lesson.lesson_15;

public class DoWhileOrWhile {
    public static void main(String[] args) {

        int minuta = 0;
        int hour = 0;

        while (hour < 24) {
        do {
            System.out.println(hour + ":" + minuta);
            minuta++;
        } while (minuta < 60);
    } hour++;
}
}
