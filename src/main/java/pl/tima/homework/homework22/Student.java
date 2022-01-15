package pl.tima.homework.homework22;

class Student {
    private  StringBuilder name;
    private  int course;
    private  double grade;

    public void setName(StringBuilder in) {
        if (in.length() > 0 && in.length() < 3)
            this.name = in;
    }

    public void setGrade(double grade) {
        if (grade > 0 && grade <= 10)
            this.grade = grade;
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

    public  double getGrade() {
        return grade;
    }

    public void showInfo (){
        System.out.println("Имя: " + getName() + "Курс: " + getCourse() + "Оценка: " + getGrade());
    }
}
