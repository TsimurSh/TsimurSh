package pl.tima.lesson.set;

import pl.tima.homework.homework22.Student;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> setEx = new HashSet<>();
        setEx.add("Igor");
        setEx.add("Marina");
        setEx.add("Zaur");
        setEx.add("Timur");
        Set<String> retain = new HashSet<>();
        setEx.add("Mama");
        setEx.add("Dima");
        setEx.add("Zaur");
        setEx.add("Timur");
//        setEx.stream().forEach(System.out::print);

//        System.out.println(setEx.contains("Timur"));

        retain.retainAll(setEx);
        retain.stream().forEach(System.out::println);

        TreeSet <Student> students = new TreeSet<>();
        Student st0 = new Student("Holy", 24, 5,4.9);
        Student st2 = new Student("Loh", 21, 2,5.5);
        Student st1 = new Student("Lohy", 25, 7,4.5);
        Student st4 = new Student("Lohh", 26, 6,4.0);
        Student st3 = new Student("Hol", 24, 5,4.9);
        Student st9 = new Student("Hola", 30, 5,4.9);
        students.add(st1);
        students.add(st4);
        students.add(st3);
        students.add(st2);
        System.out.println(students.subSet(st0,st9));
    }

}
