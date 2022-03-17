package pl.tima.javatusks.factoryhen;

public class BelarusianHen extends Hen{
    String country = "Belarusian";

    @Override
    int getCountOfEggsPerMonth() {
        return 5;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
