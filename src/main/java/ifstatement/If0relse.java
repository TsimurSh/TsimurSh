package main.java.ifstatement;

public class If0relse {
    public static void main(String[] args) {
        int aa = 300;

        if (aa < 200)
            System.out.println("Число больше 200");
        else if (aa == 301)
            System.out.println("Число  около 300");
        else if (aa <= 301)
            System.out.println("Число  меньше  301");
        else
            System.out.println("Число  неизвестно");
    }
}

class Cars {

    int engine;
    int doorsCount;

    Cars(int engine, int doorCount) {
        this.engine = engine;
        this.doorsCount = doorCount;
    }
}

class CarTest {
    int a = 15;

    public static void main(String[] args) {
        Cars c1 = new Cars(2, 4);
        Cars c2 = new Cars(3, 5);

        if (c1.engine > c2.engine /*|| a == c2.doorsCount*/) {
            //int a =6; - локальная переменная внутри фигурных скобок
            if (c1.doorsCount > c2.doorsCount)
                System.out.println("Мощность мотора и кол. дверей у первой машины больше");
            else
                System.out.println("Мощность мотора у первой больше а кол. дверей меньше");
        } else {
            System.out.println("Мощность мотора и кол. дверей у первой машины меньше");
        }
    }
}














