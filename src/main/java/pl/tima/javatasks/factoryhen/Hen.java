package pl.tima.javatasks.factoryhen;

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription(){
        return "Я - курица.";
    }
}
