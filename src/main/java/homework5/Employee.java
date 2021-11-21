package main.java.homework5;

public class Employee {

    int id;
    String surname;
    String department;
    double salary;

    Employee(int i, String s, double sal, String d) {
        id = i;
        surname = s;
        department = d;
        salary = sal;
    }

    double salaryUp2(){
        salary *=2;
        return salary;
    }

     /*void showInfo() {
        System.out.println("Работник #: " + id + "Фамилия: " + surname + "Отдел: " + department + "Зарплата: " + salary);
    }*/
    }

class EmloyeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee(77, "Gosza", 1456.7, "Tuftalogia");
        Employee e1 = new Employee(77, "Grisza", 106.7, "Tuftaproizwodstwo");

                e1.salaryUp2();
                System.out.println("Новая з/п работника " + e1.surname + ": " + e1.salary);
    }

}
