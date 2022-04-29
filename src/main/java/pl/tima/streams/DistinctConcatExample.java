package pl.tima.streams;

import java.util.stream.Stream;

public class DistinctConcatExample {
    public static void main(String[] args) {
        Stream <Integer> str1 = Stream.of(1,2,3,4,5,6,7);
        Stream <Integer> str2 = Stream.of(7,6,5,4,3,2,1);
        Stream <Integer> concat = Stream.concat(str1,str2);
//        concat.forEach(System.out::println);
        concat.distinct().forEach(System.out::println);
    }
}
