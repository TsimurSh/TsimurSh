package pl.tima.streams;

import pl.tima.homework.homework22.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FlatMapExample {
    public static void main(String[] args) {
       Student student1 = new Student("Grisha",20,1,6.7);
       Student student2 = new Student("Gosha",19,1,7.5);
       Student student3 = new Student("Gnoma",20,1,7.1);
       Student student4 = new Student("Indonez",21,1,5.7);
       Student student5 = new Student("Papaya",22,1,9.1);

            Facultry fac1 = new Facultry("Math");
            Facultry fac2 = new Facultry("Physic");
            fac1.addStudentsToListOf(student1);
            fac1.addStudentsToListOf(student2);
            fac1.addStudentsToListOf(student3);
            fac2.addStudentsToListOf(student4);
            fac2.addStudentsToListOf(student5);

            List <Facultry> facultries = new LinkedList<>();
            facultries.add(fac1);
            facultries.add(fac2);

        facultries.stream()
                .flatMap(fac -> fac.getStudentListOf()
                        .stream()).filter(student -> student.getAvGrade() > 7)
                .map(student -> {student.setCourse(2); return student;})
                .forEach(System.out::println);
    }

static class Facultry {
    String name;
    List <Student> studentListOf;

    public Facultry(String name) {
        this.name = name;
        studentListOf = new ArrayList<>();
    }

    public List<Student> getStudentListOf() {
        return studentListOf;
    }

    public void addStudentsToListOf(Student student) {
        studentListOf.add(student);
    }
}
}
