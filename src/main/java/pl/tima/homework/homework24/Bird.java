package pl.tima.homework.homework24;

abstract class Bird extends Animal implements Speakable {
     Bird() {
    }
     Bird(String name) {
        super(name);
    }

    abstract void fly ();

    @Override
    public void speak() {
            System.out.println(name + "sings");
        }
    }

