package pl.tima.homework.homework24;

 public abstract class Mammal extends Animal implements Speakable {
     Mammal() {
    }
     Mammal(String name) {
        super(name);
    }

   public abstract void run();
}

