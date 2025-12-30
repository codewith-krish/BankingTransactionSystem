package model;

import java.time.LocalDateTime;

public class Transaction {
    private int accountNumber;
    private String type;
    private double amount;
    private LocalDateTime time;

    public Transaction(int accountNumber, String type, double amount) {
        this.accountNumber = accountNumber;
        this.type = type;
        this.amount = amount;
        this.time = LocalDateTime.now();
    }

    @Override
    public String toString() {
        return type + " | Amount: " + amount + " | Time: " + time;
    }
}
