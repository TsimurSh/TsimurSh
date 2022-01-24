package pl.tima.homework.homework22;

import java.io.IOException;

public class TestAnimals {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat("Vasilij");
        Dog dog = new Dog("Bobyk");
        cat.sleep();
        System.out.println(dog.paw);
    }
}
