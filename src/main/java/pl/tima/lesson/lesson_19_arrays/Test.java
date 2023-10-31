package pl.tima.lesson.lesson_19_arrays;

import java.util.*;

public class Test {
    public static void main(String args[]){
        String array1[] = new String[][]{new String[]{"privet", "poka", "ok"}, {new String()},
    {null}}[2];

        String buy = "bitcoin";
        int y = 2;
        int x = 0;
        System.out.println(buy.substring(x, x+1) + buy.substring(y, y+2));

        List [] arr = {
          new ArrayList(),
          new LinkedList(),
          new Stack(),
          new Vector()
        };
    }
}
