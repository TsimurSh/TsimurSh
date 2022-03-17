package pl.tima.javatusks.factoryhen;

abstract class Hen {
    abstract int getCountOfEggsPerMonth();

    String getDescription(){
        return "Я - курица.";
    }
}
