package lesson_11_args;

public class Salarys {

    Salarys (String name, double salary){
        this.salary = salary;
        this. name = name;
    }
    double salary;
    String name;

    public static void swap (Salarys s1, Salarys s2) { // адрес не поменяет так как Использует копии объектов
       Salarys s3 = s1;
       s1=s2;
       s2=s3;
    }

    public static void changeName (Salarys s1) { // поменяет элемент объекта
        s1.name = "Grisha";

    }
    double sX2 (double a){
        a *=2;
        return a;
    }

    public static void main(String[] args) {
        Salarys s1 = new Salarys ("Gosha",100.11);
        double ou = s1.sX2(s1.salary);
        Salarys s2 = new Salarys("Pawel", 10000.00);
        System.out.println(ou);
        swap(s1,s2);
        changeName(s2);
        System.out.println(s2.name);
    }

}
