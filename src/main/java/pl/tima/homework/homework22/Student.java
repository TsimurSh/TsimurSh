package pl.tima.homework.homework22;

public class Student implements Comparable<Student> {
    public String name;
    public  int course;
    public double avGrade;
    public  int age;

    public Student() {
    }

    public Student(String name, int age, int course, double avGrade) {
        this.name = name;
        this.course = course;
        this.avGrade = avGrade;
        this.age = age;
    }

    public void setAvGrade(double avGrade) {
        if (avGrade > 0 && avGrade <= 10)
            this.avGrade = avGrade;
    }

    public void setCourse(int course) {
        if (course > 0 && course <= 4)
            this.course = course;
    }

    public  StringBuilder getName() {
        StringBuilder copy = new StringBuilder(name);
        return copy;
    }

    public  int getCourse() {
        return course;

    }

    public  double getAvGrade() {
        return avGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                ", avGrade=" + avGrade +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.age- other.age;
    }
}
