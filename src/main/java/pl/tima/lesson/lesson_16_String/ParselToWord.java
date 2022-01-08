package pl.tima.lesson.lesson_16_String;

public class ParselToWord {
    public static void main(String[] args) {
        String string = "Кто желает поработать?";
        int getWordCount = getWordCount(string);
        System.out.println("Количество слов в строке \"" + string + "\" равно " + getWordCount);
    }

    public static int getWordCount(String string) {

        return string.split(" ").length;
    }
}
