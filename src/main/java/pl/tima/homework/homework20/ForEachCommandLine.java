package pl.tima.homework.homework20;

import java.util.Arrays;

public class ForEachCommandLine {

    static String[] abc(String[]... arr) {
        int length = 0;
        for (String[] temp : arr) {
            length += temp.length;
        }
        String[] out = new String[length];
        int count = 0;
        for (String[] arr1 : arr) {
            for (String s : arr1) {
                out[count] = s;
                count++;
            }
        }
            return out;
    }

        public static void main (String[]args){
            String[] a = new String[]{"Goal", "scope", "mismatch"};
            String[] b = new String[]{"Goal", "scope", "compare"};
            String[] c = new String[]{"Goal", "scope", "mismatch"};
            System.out.println(Arrays.toString(abc(a, b, c)));
        }
}