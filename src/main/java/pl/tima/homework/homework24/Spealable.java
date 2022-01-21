package pl.tima.homework.homework24;

public interface Spealable {
    default void speak (){
        System.out.println("Кто-то поет");
    }
}
