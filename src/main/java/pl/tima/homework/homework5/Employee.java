package pl.tima.homework.homework5;

public class Employee {

    int id;
    public String surname;
    String department;
    private double salary;

    Employee(int i1, String s1, String d1,double sal1) {
        id = i1;
        surname = s1;
        department = d1;
        salary = sal1;
    }

    public Employee(int id, String surname, String department) {
        this.id = id;
        this.surname = surname;
        this.department = department;
    }

    private  Employee(int i1, String gosza, double v, String tuftalogia){

    }

    public double salaryUp2() {
        salary *= 2;
        return salary;
    }

     /*void showInfo() {
        System.out.println("Работник #: " + id + "Фамилия: " + surname + "Отдел: " + department + "Зарплата: " + salary);
    }*/

    public void showvalueId() {
        System.out.println(id);
    }
    public void showvalueName() {
        System.out.println(surname);
    }

    public void showvalueSalary() {
        System.out.println(salary);
    }

    static class EmloyeeTest {
        public static void main(String[] args) {
            Employee e1 = new Employee(77, "Gosza", 1456.7, "Tuftalogia");
            Employee e2 = new Employee(77, "Grisza", 106.7, "Tuftaproizwodstwo");

            e1.salaryUp2();
            System.out.println("Новая з/п работника " + e1.surname + ": " + e1.salary);
        }

    }

}

