package pl.tima.lesson.lesson_22;

import java.util.HashMap;
import java.util.Map;

public class CollectionsExample {
    public static void main(String[] args) {

        Map<Integer ,String> map1 = new HashMap<>();
        map1.put(881, "surname Shichsefiyeu");
        map1.put(882, "Christian name");
        map1.put(883, "middle name");
        map1.put(884, "nationality");
        map1.put(885, "date of birth");
        map1.remove(885);
        System.out.println(map1);

    }
}