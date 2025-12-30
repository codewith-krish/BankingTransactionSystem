package service;

import model.*;
import exception.*;
import java.util.*;

public class BankService {

    private Map<Integer, Account> accounts = new HashMap<>();
    private List<Transaction> transactions = new ArrayList<>();

    public void createAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public void deposit(int accNo, double amount) throws InvalidAccountException {
        Account acc = accounts.get(accNo);
        if (acc == null) {
            throw new InvalidAccountException("Account not found");
        }
        acc.deposit(amount);
        transactions.add(new Transaction(accNo, "DEPOSIT", amount));
    }

    public void withdraw(int accNo, double amount) throws Exception {
        Account acc = accounts.get(accNo);
        if (acc == null) {
            throw new InvalidAccountException("Account not found");
        }
        acc.withdraw(amount);
        transactions.add(new Transaction(accNo, "WITHDRAW", amount));
    }

    public void transfer(int fromAcc, int toAcc, double amount) throws Exception {
        withdraw(fromAcc, amount);
        deposit(toAcc, amount);
        transactions.add(new Transaction(fromAcc, "TRANSFER", amount));
    }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
