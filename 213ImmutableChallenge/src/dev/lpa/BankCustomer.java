package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class BankCustomer {

    private final String name;
    private static int lastID = 0;
    private final int id;

    private final List<BankAccount> accounts = new ArrayList<>();

    public BankCustomer(String name, double checkingAmount, double savingsAmount) {
        this.name = name;
        id = lastID++;
        accounts.add(new BankAccount(checkingAmount, "checking"));
        accounts.add(new BankAccount(savingsAmount, "saving"));
    }

    protected BankCustomer(BankCustomer bankCustomer){
        this.name = bankCustomer.name;
        this.id = bankCustomer.id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public List<BankAccount> getAccounts() {
        return new ArrayList<>(accounts);
    }

    @Override
    public String toString() {
        return name + " " + getId() + " " + accounts;
    }
}
