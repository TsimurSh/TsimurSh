package pl.tima.homework.homework24;

public interface Speakable {
    default void speak (){
        System.out.println("Кто-то пьёт");
    }
}
