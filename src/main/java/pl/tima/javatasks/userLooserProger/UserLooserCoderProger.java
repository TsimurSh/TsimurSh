package pl.tima.javatasks.userLooserProger;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class UserLooserCoderProger {

/*
Создать соответствующий объект [см.Person.java], например, для строки "user" нужно создать объект класса User.
Передать этот объект в метод doWork.
Написать реализацию метода doWork, который:
Вызывает метод live() у переданного объекта, если этот объект (person) имеет тип User.
Вызывает метод doNothing(), если person имеет тип Loser.
Вызывает метод writeCode(), если person имеет тип Coder.
Вызывает метод enjoy(), если person имеет тип Proger.
Requirement
User, Loser, Coder and Proger
1.Метод main должен считывать строки с клавиатуры.
2.Метод main должен прекращать считывать строки с клавиатуры, как только введенная строка не
совпадает с одной из ожидаемых (user, loser, coder, proger).
3.Для каждой корректной (user, loser, coder, proger) введенной строки должен быть вызван
метод doWork с соответствующим объектом класса Person в качестве параметра.
4.В классе Solution должен быть реализован метод doWork с одним параметром типа Person.
5.Метод doWork должен вызывать метод live() у переданного объекта, если этот объект имеет тип User.
6.Метод doWork должен вызывать метод doNothing() у переданного объекта, если этот объект имеет тип Loser.
7.Метод doWork должен вызывать метод writeCode() у переданного объекта, если этот объект имеет тип Coder.
8.Метод doWork должен вызывать метод enjoy() у переданного объекта, если этот объект имеет тип Proger.
*/

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        while (true) {

        }

            //создаем объект, пункт 2

//            doWork(person); //вызываем doWork


    }

    public static void doWork(Person person) {
        // пункт 3
    }
}

