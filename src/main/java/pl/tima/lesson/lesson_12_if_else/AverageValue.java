package pl.tima.lesson.lesson_12_if_else;

public class AverageValue {
    public static void main(String[] args) {
        int a =65;
        int b =45;
        int c =15;

        if ((a >= b && a <= c) || ( a <= b && a >= c))
            System.out.println(a);
        if ((b >= a && b <= c) || ( b <= a && b >= c))
            System.out.println(b);
        else {
            System.out.println(c);
        }
    }
}
