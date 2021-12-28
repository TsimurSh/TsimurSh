package pl.tima.lesson.lesson_20_varargs;

public class EnhancenForEachLoop {

    static int  array [] = new int[]{2,45,6,987,42,45,7,3};
    static String arraS [] = new String []{"3","45","6","987","42","45","7","3"};

    public static void main(String[] args) {
        F1D: for (int a : array) {
            System.out.printf(a + " ");
        }
        int  array2 [][] = new int[][]{{2,45,6,},{987,42,4},{5,7,3}};
        F2D: for ( int [] arr:array2){
            for (int a : arr){
                System.out.print(a + " ");
            }
        }
        int sumArr = 0;
        for ( int temp : array){
            sumArr += temp;
        }

        for (int a : array){
            for (String b : arraS){
                System.out.print(a + " " + b);
            }
        }
    }
}
