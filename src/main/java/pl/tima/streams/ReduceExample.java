package pl.tima.streams;

import java.util.ArrayList;
import java.util.List;


public class ReduceExample {
    public static void main(String[] args) {
        List <String> strings = new ArrayList<>();
        strings.add("Privet!");
        strings.add("Kak");
        strings.add("dela");
        strings.add("?");

        String string = strings.stream()
                .reduce((accumulator ,element) -> accumulator + " " + element).get();
        System.out.println(string);
    }
}
