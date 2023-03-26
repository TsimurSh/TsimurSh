package pl.tima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

    public static void main(String[] args) {
        String testString = "ё(@(@)J71490ўўў1304!@fhfykg,#$%^&*(T)";
        Pattern pattern1 = Pattern.compile("\\w+"); // Цельные последовательные цифры и буквы
        Pattern pattern2 = Pattern.compile("\\W");
        Pattern pattern3 = Pattern.compile("\\D");
        Pattern pattern4 = Pattern.compile("\\d");
        Pattern pattern5 = Pattern.compile("\\w");
        Pattern pattern = Pattern.compile("\\w+(9)");
        Matcher matcher = pattern4.matcher(testString);

        while (matcher.find()) {
            System.out.println( " " + matcher.start()+ " : " + matcher.group());
        }

    }
}
