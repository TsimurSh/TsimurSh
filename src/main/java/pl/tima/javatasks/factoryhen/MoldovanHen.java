package pl.tima.javatasks.factoryhen;

public class MoldovanHen extends Hen{
    @Override
    int getCountOfEggsPerMonth() {
        return 4;
    }
    String getDescription(){
        return super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц";
    }
}
