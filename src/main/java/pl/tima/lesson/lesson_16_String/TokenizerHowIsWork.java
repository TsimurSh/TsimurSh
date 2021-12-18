package pl.tima.lesson.lesson_16_String;

import java.util.StringTokenizer;

public class TokenizerHowIsWork {

    public static void main(String[] args) {
        String str = "Good news everyone!";

        StringTokenizer tokenizer = new StringTokenizer(str,"ne");
        while (tokenizer.hasMoreTokens())
        {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
    }
