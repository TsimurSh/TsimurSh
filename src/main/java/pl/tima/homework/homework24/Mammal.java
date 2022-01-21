package pl.tima.homework.homework24;

public abstract class Mammal extends Animal implements Spealable{
    abstract void run();
}

class Leon extends Mammal {
        String name;
        public Leon() {
        }
        public Leon(String name) {
            this.name = name;
        }
        @Override
        public void eat() {
            System.out.println("Лев любит есть мясо");
        }
        @Override
        public void run() {
            System.out.println("Лев - это не самая быстрая кошка");
        }
        @Override
        public void sleep() {
            System.out.println("Большую часть дня Лев спит");
        }
}