package pl.tima.homework.homwork18;

public class SBEquals {
    public static void main(String[] args) {
        StringBuilder suite = new StringBuilder("What accommodation have you got here?");
        StringBuilder accommodation = new StringBuilder("What's the rate per day for a suite?");
        StringBuilder sb3 = suite;
        System.out.println(stringBuilderEguals(suite, accommodation));
        System.out.println(stringBuilderEguals(suite, sb3));
    }

    private static boolean stringBuilderEguals(StringBuilder sb1, StringBuilder sb2) {
        String s1 = sb1.toString();
        String s2 = sb2.toString();
        if (s1.equals(s2)){
            return true;
        }   return false;
    }
}
