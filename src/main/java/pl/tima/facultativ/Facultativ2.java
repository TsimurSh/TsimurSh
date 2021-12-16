package pl.tima.facultativ;

public class Facultativ2 {
    public static void main(String[] args) {

//        Напишите программу, которая выводит на экран числа от 2 до 19.
//        При этом вместо чисел, кратных трем, программа должна выводить слово «Fizz»,
//        а вместо чисел, кратных пяти — слово «Buzz».
//        Если число кратно и 3, и 5, то программа должна выводить слово «FizzBuzz»

        for (int i = 2; i <= 19; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                    System.out.println("Buzz");
            }






        /*String[] arr1 = new String[]{"fizz", "buzz", "foo"};
        String[] arr2 = new String[]{ "no","foo", "not"};

        String[] result =  new String[3]; // [ null, null, "foo"]
        int index = 0;
        for (String currentWord : arr1) {
            for (String s : arr2) {
                if (currentWord.equals(s)) {
                    result[index] = currentWord;
                    break;
                }
            }

            //  System.out.println(currentWord );

        }

        System.out.println("Пересечение: " + Arrays.toString(result)); // [ "foo" ]*/
    }

}
