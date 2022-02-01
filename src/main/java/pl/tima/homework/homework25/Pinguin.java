package pl.tima.homework.homework25;

public class Pinguin extends Bird implements Speakable {

    public Pinguin() {
    }

    public Pinguin(String name) {
        super(name);
    }

    String name;

    @Override
    public void fly() {
        System.out.println("Пингвины не умеют летать");
    }

    @Override
    public void sleep() {
        System.out.println("Пингвины спят прижавшись друг к другу");
    }

    @Override
    public void eat() {
        System.out.println("Пингвин любит есть рыбу");
    }

    @Override
    public void speak() {
        System.out.println("Пингвин не умеет петь как Соловей");
    }
}
