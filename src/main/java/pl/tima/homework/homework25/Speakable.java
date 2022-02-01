package pl.tima.homework.homework25;

public interface Speakable {
    default void speak (){
        System.out.println("Кто-то пьёт");
    }
}
