package pl.tima.lesson.lesson_36_Generics;

import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
    Info <String> tipe = new Info<String>("No-noooo");
    ArrayList <Integer> intList = new ArrayList<>();
    intList.add(45);
    intList.add(43);
    intList.add(44);
        System.out.println(Info.getElementFromList(intList));
    }
    static class Info <T> {
        private T value;
        Info (T value){
            this.value = value;
        }
        public String toString (){
            return " [(" + value +  ")]";
        }
        public static  <T> T getElementFromList(ArrayList <T> list){
            return list.get(1);
        }
    }
}
