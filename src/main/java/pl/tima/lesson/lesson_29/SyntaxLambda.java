package pl.tima.lesson.lesson_29;

import pl.tima.homework.homework22.Student;

import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Supplier;



public class SyntaxLambda {

    static  ArrayList<Student> listOfStud = new ArrayList<>();

    static void testStudent (ArrayList <Student> list, Predicate <Student> checkStu){
        list.forEach(student -> {if (checkStu.test(student)) System.out.println(student);});
            }

    public static void main(String[] args) {
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
    static void changeStudents (Student stud, Consumer<Student> studentConsumer){
        studentConsumer.accept(stud);
    }
    static void createStudents (Supplier <Student> supStud) {
        for (int i = 0; i < 5; i++) {
            listOfStud.add(supStud.get());
        }
    }
}