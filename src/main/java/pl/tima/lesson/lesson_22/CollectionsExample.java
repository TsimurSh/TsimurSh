package pl.tima.lesson.lesson_22;

import java.util.*;

public class CollectionsExample {
    public static void main(String[] args) {
        Set <Integer> intSet = new HashSet<>();
        Map<Integer ,String> map1 = new HashMap<>();
        map1.put(881, "surname Shichsefiyeu");
        map1.put(882, "Christian name");
        map1.put(883, "middle name");
        map1.put(884, "nationality");
        map1.put(885, "date of birth");
        map1.put(885, "place of birth");
        map1.remove(885);
        System.out.println(map1);

        get10000Elements((List) intSet);

    }
    public static void get10000Elements (List list){
        int count = 10000;
        for (int i = 0; i < count; i++){
            list.get(count /=2);
        }
    }
}