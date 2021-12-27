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
            summaInt(24, 5, 7);
            summaIntArr(new int[]{6, 7, 8, 9, 0, 7, 54, 3});


        }
}