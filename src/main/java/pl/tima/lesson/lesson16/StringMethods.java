package pl.tima.lesson.lesson16;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = new String("privat");
        String s2 = new String("mamarama");

        char  aT = s1.charAt(3);
        System.out.println(aT);

        int i = s1.indexOf('r', 1);
        System.out.println(i);
        int i1 = s2.indexOf('a');
        System.out.println(i1);

        boolean b = s1.startsWith("va");
        System.out.println(b);
        boolean b1 = s2.startsWith("ma", 2);
        System.out.println(b1);
        boolean b2 = s1.endsWith("at");
        System.out.println(b2);

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




    }
}
