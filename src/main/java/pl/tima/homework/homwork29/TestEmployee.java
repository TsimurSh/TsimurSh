package pl.tima.homework.homwork29;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TestEmployee {

    public static void printEmployee(Emloyee emp1) {
        System.out.println(emp1);
    }

    public void filtrationEmployee(ArrayList<Emloyee> listEmp, Predicate<Emloyee> preEmp) {
        for (Emloyee emp : listEmp) {
            if (preEmp.test(emp)){
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        Emloyee empl3 = new Emloyee("TRIK", "IT", 3450);

        List <Emloyee> listOFEmp = new ArrayList<>();
        var test1 = new TestEmployee(); // variable type inference
        listOFEmp.add(new Emloyee("Grisha", "Fishers", 2980));
        listOFEmp.add(new Emloyee("Grosha", "GrolschLover", 3980));
        listOFEmp.add(new Emloyee("Grasha", "IT", 4980));
        listOFEmp.add(new Emloyee("Gresha", "Builders", 5980));

//        test1.filtrationEmployee((Emloyee empl) -> {empl.department.equals("IT"); empl.salary > 200;});
//        test1.filtrationEmployee((Emloyee empl) -> {empl.name.equals(empl.department);});
//        test1.filtrationEmployee((Emloyee empl) -> {empl.name.startsWith("A"); empl.salary < 450;});
        listOFEmp.removeIf(emp -> emp.name.equals("Grisha"));
        System.out.println(listOFEmp);
    }
}
