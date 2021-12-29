package pl.tima.lesson.lesson_20_varargs;

import java.util.Arrays;

public class Varargs {
    static void summaInt(int... a) {
        int summa = 0;
        for (int i = 0; i < a.length; i++) {
            summa += a[i];
        }
        System.out.println(summa);
        }
        static void summaIntArr ( int[] ...a){
            Arrays.sort(a);
            System.out.println(Arrays.toString(a));
        }

        public static void main (String[]args){
            summaInt(new int[]{6, 7, 8, 9, 0, 7, 5, 0});
            summaIntArr(new int[]{6, 7, 8, 9, 0, 7, 54, 3});

                    float f = (float) 128.50;
                    int i = (int) f;
                    System.out.println(i);
                    float b = (i + f)/2;
                    System.out.println(b);
                    int i5 = (int) '\u1002';
            System.out.println(i5);

        }
}
