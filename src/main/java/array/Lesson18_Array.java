package array;

public class Lesson18_Array {
    public static void main(String[] args) {
        // introduction to exceptions
        int[] array8 = new int[3];
        array8[0] = 1;
        array8[1] = 1;
        array8[2] = 1;
        array8[3] = 1; // array index out of bounds exception


        // decloration
        int b [], c; // объявление и массива и переменной одновременно
        int array1[];
        array1 = new int[]{2, 3, 4};

        String[] array2;
        double[] array3[];
        int[][] array4;
        // allocation
        array2 = new String[3];
        array3 = new double[4][2]; // 4 одномерных массива по два элемента
        array4 = new int[3][];  // с разным количеством переменных
        //System.out.println(array2.length); // без параметра () запомнить!
        // static initialization
        array2[0] = "privat";
        array2[1] = "Yuppy";
        array2[2] = "whats'up";

        array3[0][0] = 3.14;
        array3[1][2] = 3.14;
        array3[3] = array4[2];

        int[] array5 = {4, 3, 2, 1};
        int ar6[], ar7[][];

    }


    public static class Dinamic_Array {

        public static void main(String[] args) {

            String[] array1;
            int[] array2;

            array1 = new String[3];
            array2 = new int[3];

            for (int i = 0; i < array1.length; i++) {
                array1[i] = "privat" + i;
                System.out.println(array1[i]);
            }

            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    array2[i][j] = i + j;
                    System.out.println(array2[i][j]);
                }
            }
        }
    }
}