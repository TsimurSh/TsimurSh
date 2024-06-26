package pl.tima.lesson.lesson_29;

import pl.tima.homework.homework22.Student;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class SyntaxLambda {

    static  ArrayList<Student> listOfStud = new ArrayList<>();

    static void testStudent (ArrayList <Student> list, Predicate <Student> checkStu){
        list.forEach(student -> {if (checkStu.test(student)) System.out.println(student);});
            }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");

        // function list -> map
        Map<String, Integer> map = convertListToMap(list, x -> x.length());

        System.out.println(map);    // {node=4, c++=3, java=4, javascript=10}

        // method reference
        Map<String, Integer> map2 = convertListToMap(list, String::length);

        System.out.println(map2);
// function chain
        Function<String, Integer> func = String::length;

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");   // 12
        System.out.println(result);

        listOfStud.add(new Student("Uasa", 27, 3, 9.1));
        createStudents(()-> new Student("Rogan", 39, 5, 8.9));

        testStudent(listOfStud, (Student stud) -> stud.avGrade > 8.9);
        testStudent(listOfStud, stud -> stud.age > 18); // сокращение
        changeStudents(listOfStud.get(1), stud -> {
            stud.age = 21;
            stud.course = 5;
            stud.name = "Vasilij";
            stud.avGrade = 9.5;
            System.out.println("Студент повзрослел!");
        });
        Consumer <Student> consumer = stud -> {
            stud.age = 23;
            stud.course = 4;
            stud.name = "Vavan";
            stud.avGrade = 9.0;
            System.out.println("Студент повзрослел!");
        };
         consumer.accept(listOfStud.get(4));
    }
    public static  <T, R> Map<T, R> convertListToMap(List<T> list, Function<T, R> func) {

        Map<T, R> result = new HashMap<>();
        for (T t : list) {
            result.put(t, func.apply(t));
        }
        return result;

    }
    static void changeStudents (Student stud, Consumer<Student> studentConsumer){
        studentConsumer.accept(stud);
    }
    static void createStudents (Supplier <Student> supStud) {
        for (int i = 0; i < 5; i++) {
            listOfStud.add(supStud.get());
        }
    }
}
