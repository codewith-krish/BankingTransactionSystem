package main;

import model.*;
import service.BankService;

public class BankApp {

    public static void main(String[] args) throws Exception {

        BankService bank = new BankService();

        Customer c1 = new Customer(1, "Krishnendu");
        Customer c2 = new Customer(2, "User2");

        Account a1 = new SavingsAccount(101, c1, 2000);
        Account a2 = new CurrentAccount(102, c2, 3000);

        bank.createAccount(a1);
        bank.createAccount(a2);

        bank.deposit(101, 500);
        bank.withdraw(102, 1000);
        bank.transfer(101, 102, 300);

        bank.printTransactions();
    }
}
