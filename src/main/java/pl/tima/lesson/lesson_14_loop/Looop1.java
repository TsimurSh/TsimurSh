package main.java.nestedloopwithlable;

public class Looop1 {

    public void time() {
        OUTER: for (
                short chas = 0;
                chas <= 23; chas++) {
             //назначаем lable для управления внешними лупами из внутреннего
            INNER:for (short minuta = 0; minuta <= 59; minuta++) {
                System.out.println(chas + " : " + minuta);
                if (minuta == 30) break OUTER;
            }
        }
    }

    public static void main(String[] args){
        Looop1 t = new Looop1();
          t.time();
    }
}

