package pl.tima.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {

    public static void main(String[] args) {
        List <String> oldlist = new ArrayList<>();
        oldlist.add("Privet");
        oldlist.add("Aga");
        oldlist.add("Da-da");
        oldlist.add("Poka");

        // преобразование в Integer
        List <Integer> newList = oldlist.stream().map(element -> element.length())
                .collect(Collectors.toList());
        System.out.println(newList);

        int [] oldArray = {98,65,24,56};
        int [] newArray;
        newArray = Arrays.stream(oldArray).map(element -> {
            if (element < 30){
                element += element + 1;}
            return element;
        }).toArray();
        Arrays.stream(newArray).forEach(el -> System.out.println(el));
    }
}
