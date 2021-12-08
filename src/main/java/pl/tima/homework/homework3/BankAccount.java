package main.java.homework3;

public class BankAccount {
    int id = 11;
    String name = "Timur";
    double balance = 100.00;

    double popolnienieScheta (double priplywdollars) {
        balance += priplywdollars;
        return balance;
    }

    double sniatieSoScheta (double otplywdollars) {
        balance -= otplywdollars;
        return balance;
    }
}
