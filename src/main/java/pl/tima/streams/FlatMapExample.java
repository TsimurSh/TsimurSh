package pl.tima.streams;

import pl.tima.homework.homework22.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FlatMapExample {
    public static void main(String[] args) {
        Student student1 = new Student("Grisha", 20, 1, 6.7);
        Student student2 = new Student("Gosha", 19, 1, 7.5);
        Student student3 = new Student("Gnoma", 20, 1, 7.1);
        Student student4 = new Student("Indonez", 21, 1, 5.7);
        Student student5 = new Student("Papaya", 22, 1, 9.1);

        Facultry fac1 = new Facultry("Math");
        Facultry fac2 = new Facultry("Physic");
        fac1.addStudentsToListOf(student1);
        fac1.addStudentsToListOf(student2);
        fac1.addStudentsToListOf(student3);
        fac2.addStudentsToListOf(student4);
        fac2.addStudentsToListOf(student5);

        List<Facultry> facultries = new LinkedList<>();
        facultries.add(fac1);
        facultries.add(fac2);

        facultries.stream()
                .flatMap(fac -> fac.getStudentListOf()
                        .stream()).filter(student -> student.getAvGrade() > 7)
                .map(student -> {
                    student.setCourse(2);
                    return student;
                })
                .forEach(System.out::println);

        ArrayList<Student> suppStudent;
        suppStudent = studentCreater(() -> new Student("hash5", 45, 1, 4.5));

        suppStudent.stream().forEach(System.out::println);

        Consumer<Student> consumer = student -> {
            student.name = "Gash";
            student.age = 45;
            student.course = 1;
            student.avGrade = 4.5;
        };
        consumer.accept(suppStudent.get(0));
    }

    static ArrayList<Student> studentCreater(Supplier<Student> ouStudents) {
        ArrayList<Student> stArr = new ArrayList<>();
        for (int c = 0; c < 3; c++) {
            stArr.add(ouStudents.get());
        }
        return stArr;
    }

//    static void studentCreater(Student student, Consumer<Student> consumer) {
//    consumer.accept(student);
//    }

}

class Facultry {
    String name;
    List<Student> studentListOf;

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

