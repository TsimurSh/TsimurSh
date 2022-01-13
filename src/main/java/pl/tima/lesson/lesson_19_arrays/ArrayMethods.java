package pl.tima.lesson.lesson_19_arrays;

import java.util.Arrays;

public class ArrayMethods {
    ArrayMethods () {
    }


    public int[] insertionSort(int[] sortArr) {
        for (int s = 1; s < sortArr.length; s++) {
            int current = sortArr[s];
            int j = s - 1;
            while (j >= 0 && current < sortArr[j]) {
                sortArr[j + 1] = sortArr[j];
                j--;
            }
            sortArr[j + 1] = current;
        }
        return sortArr;
    }

    public static void bubbleSort(int[] arr) {
        boolean sort = false;
        int temp;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    sort = false;
                }
            }
        }
    }
        public static boolean isnumb(String str){
            if (str.length() == 0) {
                return false;
            }

            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char character = chars[i];
                if ((i != 0 && character == '-') // Строка содержит '-'
                        || (!Character.isDigit(character) && character != '-') // или не цифра и не начинается с '-'
                        || (chars.length == 1 && character == '-')) // или одиночный '-'
                {
                    return false;
                }
            }
            return true;
        }

    public static void main(String[] args) {
        ArrayMethods arry = new ArrayMethods();
        int sum = 0;
        int arr1[] = {0, -4, 7, 12, -50, 101};
        String [] arr2 = {"to take keys alont with somebody", "876", "to hamper", "foreign exchange desk"};
        int arr8[] = {0, -4, 7, 7, 5, 11};
        bubbleSort(arr1);
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1); // соритирует по возрастанию

        int index1 = Arrays.binarySearch(arr1, 7); // ищет только отсортированные элементы массивов
        System.out.println(index1);

        int boo = Arrays.compare(arr1, arr8);
        int bo = Arrays.mismatch(arr1, arr8);
        System.out.println(boo + " " + bo + " ");


        int[] array1 = new int[20];
        int valueStart = 10;
        int valueEnd = 13;
        double [] digits = new double[]{154.23467,89.7867553,3243.5678,8.76542,23.4565,67.87,898.676,34.5657897};


        int fPart = array1.length % 2 == 0 ? array1.length / 2 : array1.length / 2 + 1;
        Arrays.fill(array1, 0, fPart, valueStart);

        Arrays.fill(array1, fPart, array1.length, valueEnd);
        System.out.println(Arrays.toString(array1));

    }
}