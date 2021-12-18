package pl.tima.lesson.lesson_16_String;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("privat");
        String s2 = new String("mamarama");

        char  aT = s1.charAt(3);
        System.out.println(aT);

        int i = s1.indexOf('r', 1);
        System.out.println(i);
        int i1 = s2.lastIndexOf("ma");
        System.out.println(i1);

        boolean b = s1.startsWith("va");
        System.out.println(b);
        boolean b1 = s2.startsWith("ma", 2);
        System.out.println(b1);
        boolean b2 = s1.endsWith("at");
        System.out.println(b2);
        var b3 = s2.contains("ma");
        System.out.println(b3);
        boolean b4 = s1.matches(s2);


        String s3 = s2.substring(1,3); // all to 3 index
        System.out.println(s3);

        String s4 = s2.trim();
        System.out.println(s4);

        String s5 = s1.replace("at","ucha");
        System.out.println(s5);

        String s5_1 = "mmm";
        String s6 = s5_1.replace('m','m');
        System.out.println(s5_1 == s6);

        System.out.println(s5_1.concat(s1)); // s5 plus s1

        String s7 = s1.toUpperCase();
        System.out.println(s7);
        boolean b6 = s7.equalsIgnoreCase(s1);

        System.out.println(s7.toLowerCase() + b4);

        String se1 = new String("privet, meshok kanfet");
        char [] cha = se1.toCharArray();

        int i2 = se1.compareTo(s1); // возвращает количество совпадающих символов
        System.out.println(i2);

        boolean b5 = s1.regionMatches(2,se1,7,3); //Сравнивает части строк
        System.out.println(b5);

        String str = "Good news everyone!";
        String[] strings = str.split("ne");
        System.out.println(Arrays.toString(strings));


    }
}
