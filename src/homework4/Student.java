package homework4;

public class Student {

    byte index;
    String name;
    String lastName;
    int year;
    byte gradeMath;
    byte gradeEconomy;
    byte gradeForeignLang;
}

class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.index = 01;
        s1.name = "Uasia";
        s1.lastName = "Sylij";
        s1.year = 18;
        s1.gradeMath = 4;
        s1.gradeEconomy = 5;
        s1.gradeEconomy = 3;
        int averageGrade = (s1.gradeMath + s1.gradeEconomy + s1.gradeForeignLang) / 3;
        System.out.println("Средняя оценка: " + averageGrade);
    }
}
    
