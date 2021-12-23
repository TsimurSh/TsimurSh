package pl.tima.lesson.lesson_6;

public class CubeInCube {

    public static void main(String[] args) {
        System.err.println(ningth(3));
    }

    public static long cube (long a) {
        return a*a*a;
    }
    public static long ningth (long b) {
        return cube (cube(b));
    }
}
