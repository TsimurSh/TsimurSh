package pl.tima.javatusks.factoryhen;

public class RussianHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 2;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.RUSSIA + " Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц";
    }
}
