package pl.tima.facultativ;

import pl.tima.homework.homework24.*;

public class Fakulatiw {

    public static void main(String[] args) {
        Marlin test24 = new Marlin("Mechenosec");
        System.out.println(test24.name);
        test24.sleep();
        test24.swim();
        test24.eat();
        Speakable test24_1 = new Pinguin();
        test24_1.speak();
        Animal test24_2 = new Leon("Banifacy");
        System.out.println(test24_2.name);
        test24_2.sleep();
        test24_2.eat();
        Mammal test24_3 = new Leon("Banifacy2");
        System.out.println(test24_3.name);
        test24_3.speak();
        test24_3.run();
        test24_3.eat();
        test24_3.sleep();






//        String [] piacStrok = new String []{"var", "methods", "The Longest String", "short"};
//        int wordLength = 0;
//
//        for (int i = 0; i < piacStrok.length ; i++) {
//            String currentWord = piacStrok[i];
//            int currentWordLength = currentWord.length();
//            if (wordLength < currentWordLength) {
//                wordLength = currentWordLength;
//            }
//        }
//        System.err.println("\nРезультат: " + wordLength);
    }
}
