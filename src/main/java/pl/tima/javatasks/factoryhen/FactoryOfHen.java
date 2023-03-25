package pl.tima.javatasks.factoryhen;

public class FactoryOfHen {
    /*
Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и быть созданы в отдельных файлах.
Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth,
который должен возвращать количество яиц в месяц от данного типа куриц.
Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription родительского класса таким образом,
чтобы возвращаемая ими строка имела вид:
<getDescription() родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны, а N - количество яиц в месяц.
Метод getHen должен быть реализован в классе HenFactory и возвращать тип кур для переданной в него страны.

*/
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals(Country.BELARUS)) hen = new BelarusianHen();
            if(country.equals(Country.MOLDOVA)) hen = new MoldovanHen();
            if(country.equals(Country.UKRAIN)) hen = new UkrainianHen();
            if(country.equals(Country.RUSSIA)) hen = new RussianHen();
            return hen;
        }
    }
}
