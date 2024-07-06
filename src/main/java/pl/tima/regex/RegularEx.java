package pl.tima.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

    public static void main(String[] args) {
        String testString = "ё(@(@)J71490ўўў1304!@fhfykg,#$%^&*(T)";
        String testIP = "255.155.67.99";
        Pattern pattern1 = Pattern.compile("\\w+"); // Цельные последовательные цифры и буквы
        Pattern pattern2 = Pattern.compile("\\W");
        Pattern pattern3 = Pattern.compile("\\D");
        Pattern pattern4 = Pattern.compile("\\d");
        Pattern pattern5 = Pattern.compile("\\w");
        Pattern pattern = Pattern.compile("\\w+(9)");
        Matcher matcher = pattern4.matcher(testString);

        Pattern patternIP = Pattern.compile("(25[0-5] | 2[0-4]\\d | [01]?\\d?\\d)(\\.){3}(25[0-5]|2[0-4]\\d|[01]?\\d?\\d)");
        Matcher matcherIP = patternIP.matcher(testIP);
        System.out.println(matcherIP.matches());



        while (matcher.find()) {
            System.out.println( " " + matcher.start()+ " : " + matcher.group());
        }
    }
}
