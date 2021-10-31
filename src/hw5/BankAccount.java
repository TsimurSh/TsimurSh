package hw5;

public class BankAccount {
    int id = 11;
    String name = "Timur";
    double balance = 100.00;

    double popolnienieScheta (double dollars) {
        balance += dollars;
        return balance;
    }

    double sniatieSoScheta (double dollars) {
        balance -= dollars;
        return balance;
    }

}
