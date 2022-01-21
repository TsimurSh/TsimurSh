package pl.tima.homework.homework24;

public abstract class Bird extends Animal implements Spealable {
    abstract void fly ();

    @Override
    public void speak() {
            System.out.println(name + "sings");
        }
    }

class Pinguin extends Bird{

        public Pinguin() {
        }
        public Pinguin(String name) {
            this.name = name;
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
    }
