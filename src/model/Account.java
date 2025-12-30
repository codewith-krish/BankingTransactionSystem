package model;

public abstract class Account {
    protected int accountNumber;
    protected Customer customer;
    protected double balance;

    public Account(int accountNumber, Customer customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public abstract void withdraw(double amount) throws Exception;
}
