package pl.tima.lesson.lesson_16_String;

public class FormatterExample {
    public static void main(String[] args) {
        System.out.println(format("Амиго", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = "Меня зовут . Я буду зарабатывать $ в месяц.";
        String splitPhrase = phrase.format("Меня зовут %s. Я буду зарабатывать $%s в месяц." ,name , salary);
        return splitPhrase;
    }
}
