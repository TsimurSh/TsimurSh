package pl.tima.lesson.lesson_16_String;

import java.util.Arrays;
import java.util.StringTokenizer;

public class TokenizerHowIsWork {

    public static void main(String[] args) {
        String packagePath = "java.util.stream";
        String[] tokens = getTokens(packagePath, "\\.");
        System.out.println(Arrays.toString(tokens));
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer token = new StringTokenizer(query, delimiter);
        int i = 0;
        String [] tokens = new String[token.countTokens()];
        while (token.hasMoreTokens()){
            tokens [i] = token.nextToken();
            i++;
        }

        return tokens;
    }
}
