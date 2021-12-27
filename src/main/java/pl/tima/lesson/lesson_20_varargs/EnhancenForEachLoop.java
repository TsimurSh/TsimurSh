package pl.tima.lesson.lesson_20_varargs;

public class EnhancenForEachLoop {

    static int  array [] = new int[]{2,45,6,987,42,45,7,3};

    public static void main(String[] args) {
        for (int a : array) {
            System.out.printf(a + " ");
        }
        int sumArr = 0;
        for ( int temp : array){
            sumArr += temp;
        }
        System.out.println(sumArr);
    }
}
