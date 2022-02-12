package pl.tima.facultativ;

import pl.tima.homework.homework25.*;

import java.util.ArrayList;

public class Fakulatiw {

    public static void main(String[] args) {
        Mammal test25 = new Cat();
        test25.sleep();
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
        Mammal test24_3 = (Cat) test24_2; // расширение типа
        System.out.println(((Leon)test24_3).name); // скобки
        test24_3.speak();
        test24_3.run();
        test24_3.eat();
        test24_3.sleep();
        ArrayList <Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(test24);
        listOfAnimals.add(test25);
        listOfAnimals.add((Animal) test24_1);
        listOfAnimals.add(test24_3);
        listOfAnimals.add(test24_2);
        for (Object o : listOfAnimals){
            if (o instanceof Animal)
                System.out.println(o.toString());
        }




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
