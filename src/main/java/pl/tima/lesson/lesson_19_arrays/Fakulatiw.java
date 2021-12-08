package pl.tima.lesson.lesson_19_arrays;

public class Fakulatiw {

    public static void main(String[] args) {
        String [] piacStrok = new String []{"var", "methods", "The Longest String", "short"};
        int wordLength = 0;

        for (int i = 0; i < piacStrok.length ; i++) {
            String currentWord = piacStrok[i];
            int currentWordLength = currentWord.length();
            if (wordLength < currentWordLength) {
                wordLength = currentWordLength;
            }
        }
        System.err.println("\nРезультат: " + wordLength);
    }
}
