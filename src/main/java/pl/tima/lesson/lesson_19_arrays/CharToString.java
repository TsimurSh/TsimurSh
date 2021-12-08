package pl.tima.lesson.lesson_19_arrays;

public class CharToString {

    public static void main(String[] args) {


        String m = "mama";
        char[] array = m.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        String mama = new String(array);
        System.out.println(mama);

        char[] reverse1 = new char []{'p','r','i','v','a','t'};
        StringBuilder sb = new StringBuilder("Hello holl");
        sb.append(reverse1, 1, 3); // c какого индекса и сколько
        sb.insert(1, reverse1, 2, 2); // c какой буквы и тоже самое, что выше
        System.out.println(sb);


    }
}