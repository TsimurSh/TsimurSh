package main.java.homework4;

public class OldStudent {

    OldStudent(byte indexID1, String name1, String lastName1, int year1, double gradeMath1, double gradeEconomy1, double gradeForeignLang1) {
        indexID = indexID1;
        name = name1;
        lastName = lastName1;
        year = year1;
        gradeMath = gradeMath1;
        gradeEconomy = gradeEconomy1;
        gradeForeignLang = gradeForeignLang1;
    }



    OldStudent() {
    }

    byte indexID;
    String name;
    String lastName;
    int year;
    double gradeMath;
    double gradeEconomy;
    double gradeForeignLang;

    public OldStudent(int i, String vovka, String ivanov, int i1) {
    }

    static class StudentTest {

        double averagegrade(main.java.homework4.OldStudent s) {
            double resultAverage = (s.gradeEconomy + s.gradeMath + s.gradeForeignLang) / 3;
            System.out.println("Средняя оценка студента " + s.name + " " + s.lastName +
                    " с номером Студ.билета " + s.indexID + ": " + resultAverage);
            return resultAverage;
        }


        public static void main(String[] args) {
            main.java.homework4.OldStudent s1 = new main.java.homework4.OldStudent();
            s1.indexID = 001;
            s1.name = "Uasia";
            s1.lastName = "Sylij";
            s1.year = 2;
            s1.gradeMath = 4.2;
            s1.gradeEconomy = 5.3;
            s1.gradeEconomy = 3.2;

            main.java.homework4.OldStudent s2 = new main.java.homework4.OldStudent(4, "Vovka", "Ivanov", 4);


            StudentTest sTest = new StudentTest();
            sTest.averagegrade(s1);
        }
    }
}

