package pl.tima.facultativ;

import java.util.Arrays;

public class Facultativ4 {


    static boolean isTheSame (String str1, String str2){
        if (str1.length() != str2.length()){
            return false;
        }
        return sort(str1).equals(sort(str2));
    }

    private static String sort(String str1) {
        char [] first = str1.toCharArray();
        Arrays.sort(first);
        String s = new String(first);
        return s;
    }


    public static void main(String[] args) {
        boolean theSame = isTheSame("MAMA", "AMAM");
        System.out.println(theSame);
        boolean theSame2 = isTheSame("MAMA", "AMAMR");
        System.out.println(theSame2);
        boolean theSame3 = isTheSame("MAMA", "PAPA");
        System.out.println(theSame3);



    }
}
