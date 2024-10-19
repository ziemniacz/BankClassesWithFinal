package dev.newu;

import dev.lpa.BankAccount;
import dev.lpa.BankCustomer;

import java.util.List;

public class ChildBankCustomer extends BankCustomer {

    public ChildBankCustomer(BankCustomer bankCustomer) {
        super(bankCustomer);
    }

    public ChildBankCustomer(String name) {
        super(name, 0, 0);
    }

    @Override
    public int getId() {
        return 0;
    }

    @Override
    public List<BankAccount> getAccounts() {
        return super.getAccounts();
    }
}
