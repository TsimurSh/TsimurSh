package lesson_11_args;

public class SalaryX2 {

    SalaryX2 (String name, double salary){
        this.salary = salary;
        this. name = name;
    }
    String salary;
    double name;

    double sX2 (double a){
        a *=2;
        return a;
    }

    public static void main(String[] args) {
        SalaryX2 s1 = new SalaryX2("Gosha",100.11);
        double ou = s1.sX2(s1.salary);
        System.out.println(ou);
    }

}
