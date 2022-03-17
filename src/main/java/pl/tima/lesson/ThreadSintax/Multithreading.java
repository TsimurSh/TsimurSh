package pl.tima.lesson.ThreadSintax;

public class Multithreading {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread1");
            }
        }).start();
        new Thread (()-> System.out.println("Thread2")).start();
    }
}
