package pl.tima.lesson.lesson_36_Generics;

public class GenericsExmple {
    public static void main(String[] args) {
    Info <String> tipe = new Info<String>("No-noooo");

    }
    static class Info <T> {
        private T value;
        Info (T value){
            this.value = value;
        }
        public String toString (){
            return " [(" + value +  ")]";
        }
    }
}
