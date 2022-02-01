package pl.tima.homework.homework25;

public class Cat extends Mammal{
    public Cat() {
    }

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
    }

    public  void eat(){
        System.out.println("Cat eats");
    }

    public void sleep(){
        System.out.println("Кот спит 18 часов в сутки");
    }
}
