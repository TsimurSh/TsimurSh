package pl.tima.lesson.lesson_29;

import pl.tima.homework.homework22.Student;

import java.util.ArrayList;

public class SyntaxLambda {

    void testStudent (ArrayList <Student> list, StudentChecks checkStu){
        for (Student s : list){
            if (checkStu.check(s)){
                System.out.println(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList <Student> listOfStud = new ArrayList<>();
        listOfStud.add(new Student("Uasa", 27, 3, 9.1 ))
         SyntaxLambda exLa = new SyntaxLambda();
         exLa.testStudent(listOfStud, (Student stud) -> {return stud.avGrade > 8.7});
    }

    interface StudentChecks{
        boolean check(Student stud);
    }
}
