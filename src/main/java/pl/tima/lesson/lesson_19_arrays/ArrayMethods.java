package pl.tima.lesson.lesson_19_arrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void bubbleSort (int [] arr){
        boolean sort = false;
        int temp;
        while (!sort){
            sort = true;
            for (int i = 0; i < arr.length - 1 ; i++) {
                if (arr[i] > arr[i+1]){
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sort = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = {0, -4, 7, 12, -50, 101};
        int arr2[] = {0, -4, 7, 12, -50, 101};
//        int arr2[] = {0, -4, 7, 7, 5, 11};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1); // соритирует по возрастанию

        int index1 = Arrays.binarySearch(arr1, 7); // ищет только отсортированные элементы массивов
//        System.out.println(index1);

        int boo = Arrays.compare(arr1,arr2);
        int bo = Arrays.mismatch(arr1,arr2);
        System.out.println(boo + " "+ bo);
    }

    public static void minMax(double[] array) {
        double max = array[0];
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        class ArrayFill {

            public int[] array = new int[20];
            public  int valueStart = 10;
            public  int valueEnd = 13;

            public  void main(String[] args) {

                int fPart = array.length % 2 == 0 ? array.length / 2 : array.length / 2 + 1;
                Arrays.fill(array, 0, fPart, valueStart);

                Arrays.fill(array, fPart, array.length, valueEnd);
                System.out.println(Arrays.toString(array));
            }
        }


    }

}
