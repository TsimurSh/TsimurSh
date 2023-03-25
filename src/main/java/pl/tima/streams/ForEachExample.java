package pl.tima.streams;

import java.util.Arrays;

public class ForEachExample {

    public static void main(String[] args) {
        int [] testArray = {23,35,86,42,23,43};
        Arrays.stream(testArray).forEach(element ->
                element = 42);
        Arrays.stream(testArray).forEach(System.out::println);
    }
}
