package dev.lpa;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        BankAccount ba = new BankAccount(10.00, "checking");

        BankCustomer dziadu = new BankCustomer("Mariusz Wiech", 100, 100);
        System.out.println(dziadu);

        List<BankAccount> accounts = dziadu.getAccounts();
        accounts.clear();
        System.out.println(dziadu);

//
//        ChildBankCustomer pradziadu = new ChildBankCustomer(dziadu.getName(), dziadu.getAccounts());
//        System.out.println(pradziadu);
//
//        ChildBankCustomer przodek = new ChildBankCustomer(dziadu);
//        System.out.println(przodek);
//
//        List<BankAccount> accounts = przodek.getAccounts();
//        accounts.set(0, new BankAccount(10.01, "checking"));
//        System.out.println(przodek);
//        System.out.println(dziadu);
    }
}
