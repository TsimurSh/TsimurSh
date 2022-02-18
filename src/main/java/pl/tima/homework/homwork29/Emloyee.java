package pl.tima.homework.homwork29;

public class Emloyee {

    public Emloyee(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String name;
    public String department;
    public int salary;

    public Emloyee() {
    }


    @Override
    public String toString() {
        return "" +
                "Имя: " + name + '\n' +
                "Отдел: " + department + '\n' +
                "З/П: $" + salary + '\n' + "---------------------------------------------------------------------" + '\n';
    }
}
