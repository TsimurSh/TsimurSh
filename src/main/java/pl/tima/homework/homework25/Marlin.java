package pl.tima.homework.homework25;

public class Marlin extends Fish{
    public Marlin() {
    }
    public Marlin(String name) {
        super(name);
    }

    @Override
    public void swim() {
        System.out.println("Марлин, красивая рыба которая быстро плавает");
    }

    @Override
    public void eat() {
        System.out.println("Марлин, хищная рыба которая ест птичий корм");
    }
}
