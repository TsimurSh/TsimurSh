package lesson_19_arrays;

import java.util.Arrays;

public class Array_Methods {
    public static void main(String[] args) {
        int arr1[] = {0, -4, 7, 12, -50, 101};
        Arrays.sort(arr1); // соритирует по возрастанию

        int index1 = Arrays.binarySearch(arr1,7); // ищет только отсортированные элементы массивов
        System.out.println(index1);

    }

    public static void minMax (double [] array) {
      double max = array [0];
      double min = array [0];
        for (int i = 1; i < array.length; i++) {
            if  (array[i] > max)
                max = array[i];
            if (array[i] < min)
               min =  array[i];
        }
        public class ArrayFill {

            public static int[] array = new int[20];
            public static int valueStart = 10;
            public static int valueEnd = 13;

            public static void main(String[] args) {
                int fPart = array.length%2==0 ? array.length /2 : array.length /2+1;
                Arrays.fill (array, 0,fPart, valueStart);

                Arrays.fill (array,fPart,array.length, valueEnd);
                System.out.println(Arrays.toString(array));
            }
        }


    }

}
