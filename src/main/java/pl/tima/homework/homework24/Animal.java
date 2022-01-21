package pl.tima.homework.homework24;

public abstract class Animal {
    static String name;
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();

}

abstract class Fish extends Animal {
    String name;
    public Fish() {
    }

    public Fish(String name) {
        this.name = name;
    }
    abstract public void swim();

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
}

