package array;

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


    }

}

public class CharToString {

    public static void main(String[] args) {
        char [] privet;
        privet = new char[]{'p','r','i','v','a','t'};
        String priv = new String(privet);
        System.out.println(priv);
    }

        }