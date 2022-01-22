package pl.tima.homework.homework24;

public abstract class Animal {
    public String name = "";
    public Animal() {
    }
    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();

    public abstract void sleep();

}

abstract class Fish extends Animal {
     Fish() {
    }

     Fish(String name) {
        super(name);
    }
    abstract public void swim();

    @Override
    public void sleep() {
        System.out.println("Всегда интересно наблюдать как спят рыбы");
    }
}

