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
        static int [] copyIntArrsToArr ( int[] ...arrs){
        int lenth =0;
        for (int [] arr : arrs){
            lenth += arr.length;
        }
        int [] copy = new int[lenth];
        int count = 0;
        for (int [] arr1 : arrs ){
            for (int temp : arr1){
                copy[count] = temp;
                count++;
            }
        } return copy;
//        System.out.println(Arrays.toString(a));
        }

        public static void main (String[]args){
            summaInt(new int[]{6, 7, 8, 9, 0, 7, 5, 0});
            System.out.println(Arrays.toString(copyIntArrsToArr(new int[]{6, 7, 8, 9, 0,98, 7, 54, 3},new int[]{6, 7, 8, 9, 0, 7, 5, 0},new int[]{6, 7, 8, 9, 10, 7, 5, 0})));

                    float f = (float) 128.50;
                    int i = (int) f;
                    System.out.println(i);
                    float b = (i + f)/2;
                    System.out.println(b);
                    int i5 = (int) '\u1002';
            System.out.println(i5);

        }
}
