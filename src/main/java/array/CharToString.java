package array;


public class CharToString {

    public static void main(String[] args) {
        char[] reverse;
        reverse = new char[]{'m', 'a', 'm', 'a'};

        for (int i = reverse.length; i >= 0; i--) {
            System.out.println(reverse[i]);
        }
    }
}