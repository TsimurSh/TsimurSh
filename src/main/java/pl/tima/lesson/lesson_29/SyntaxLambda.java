package pl.tima.lesson.lesson_29;

import pl.tima.homework.homework22.Student;

import java.util.ArrayList;
import java.util.function.Predicate;

public class SyntaxLambda {

    void testStudent (ArrayList <Student> list, Predicate <Student> checkStu){
        for (Student s : list){
            if (checkStu.test(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> listOfStud = new ArrayList<>();
        listOfStud.add(new Student("Uasa", 27, 3, 9.1 ));
         SyntaxLambda exLa = new SyntaxLambda();
         exLa.testStudent(listOfStud, (Student stud) -> {return stud.avGrade > 8.7;});
         exLa.testStudent(listOfStud, stud -> stud.age > 18); // сокращение
    }

    interface StudentChecks{
        boolean check(Student stud);
    }
}
