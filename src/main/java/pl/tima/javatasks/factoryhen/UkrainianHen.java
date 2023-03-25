package pl.tima.javatasks.factoryhen;

public class UkrainianHen extends Hen{
    String country = "Ukrainian";

    @Override
    int getCountOfEggsPerMonth() {
        return 7;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.UKRAIN + " Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц";
    }
}
