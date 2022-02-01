package pl.tima.homework.homework25;

public class Leon extends Cat {
    public Leon() {
    }

    public Leon(String name) {
        super(name);
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
