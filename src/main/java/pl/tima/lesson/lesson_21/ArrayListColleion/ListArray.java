package pl.tima.lesson.lesson_21.ArrayListColleion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListArray {
    public static void main(String[] args) {
        ArrayList<StringBuilder> listsb1 = new ArrayList<>();
        StringBuilder sb1 = new StringBuilder("bell-boy");
        StringBuilder sb2 = new StringBuilder("desk-clerk");
        StringBuilder sb3 = new StringBuilder("lift-boy");
        listsb1.add(sb1);
        listsb1.add(sb2);
        listsb1.add(sb3);

        ArrayList<String> list = new ArrayList<>(); // by-default 10 elements
        list.add("wrapper");
        list.add(1, "abrakadabra");
//        list.addAll(1,list1);
        list.set(1,"nie-abrababra"); // like replace
//        System.out.println(list.remove("wrapper")); // возвращает boolean ? если удалил и : false when don't

        ArrayList<String> list1 = new ArrayList<>(list);
        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list1.get(i) + " ");
        }
//        System.out.println("     " + list.indexOf("wrapper"));
        for (int i = 0; i < list.size(); i++) {
//            System.out.print(list.get(i) + " ");
//        }
            ArrayList<String> list3 = (ArrayList<String>) list1.clone();
//        list3.set(1,"porter");
            int sizeList3 = list3.hashCode();
            int sizeList1 = list1.hashCode();
//            System.out.println(list1 + " " + list3 + " " + sizeList1 + " " + sizeList3);
            Collections.sort(listsb1); // сортирует list

            StringBuilder[] sbArr1 = listsb1.toArray(new StringBuilder[listsb1.size()]); // sintex toArray(); method
            for (StringBuilder sb : sbArr1) {
                 System.out.println(sb + " ");

                 Object [] arrayFromArrayList = list3.toArray();
                System.out.print(Arrays.toString(arrayFromArrayList));
            }
        }
    }
}