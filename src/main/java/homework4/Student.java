package main.java.homework4;

public class Student {

    byte indexID;
    String name;
    String lastName;
    int year;
    double gradeMath;
    double gradeEconomy;
    double gradeForeignLang;
}

class StudentTest{

    double averagegrade (Student s){
        double resultAverage = (s.gradeEconomy + s.gradeMath + s. gradeForeignLang ) /3;
        System.out.println("Средняя оценка студента " + s.name + s.lastName + " с номером Студ.билета " + s.indexID + ": " + resultAverage);
        return resultAverage;
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.indexID = 01;
        s1.name = "Uasia";
        s1.lastName = "Sylij";
        s1.year = 18;
        s1.gradeMath = 4.2;
        s1.gradeEconomy = 5.3;
        s1.gradeEconomy = 3.2;


        StudentTest sTest = new StudentTest();

    }
    
