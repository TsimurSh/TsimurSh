package lesson_19_arrays;

public class CharToString {

    public static void main(String[] args) {
        char[] reverse1;
        reverse1 = new char[]{'m', 'a', 'm', 'a'};
        char reverse2[] = new char[reverse1.length];
        int i1 = 0;
        for (int i = reverse1.length; i >= 0; i--, i1++) {
            reverse2[i1] = reverse1[i];
        }
        String mama = new String(reverse2);
        System.out.println(mama);

        StringBuilder sb = new StringBuilder("Hello holl");
        sb.append(reverse1, 1, 3); // c какого индекса и сколько
        sb.insert(1, reverse1, 2, 2); // c какой буквы и тоже самое, что выше
        System.out.println(sb);


    }
}