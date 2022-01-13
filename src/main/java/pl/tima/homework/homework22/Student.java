package pl.tima.homework.homework22;

public class Student {
    private StringBuilder name;
    private byte course;
    private float grade;

    public void setName(StringBuilder in) {
        if (in.length() > 0 && in.length() < 3)
            this.name = in;
    }

    public void setGrade(float grade) {
        if (grade > 0 && grade <= 10)
            this.grade = grade;
    }

    public void setCourse(byte course) {
        if (course > 0 && course <= 4)
            this.course = course;
    }
    public void showInfo (){
        System.out.println("Имя: " + name.toString() + "Курс: " + course + "Оценка: " + grade);
    }
}
