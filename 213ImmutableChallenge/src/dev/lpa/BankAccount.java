package dev.lpa;

public class BankAccount {

    private enum Type{
        CHECKING, SAVING
    }

    private double iniAmount;
    private Type type;

    public BankAccount(double iniAmount, String type) {
        this.iniAmount = iniAmount;
        this.type = Enum.valueOf(Type.class, type.toUpperCase());
    }

    public double getIniAmount() {
        return iniAmount;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return type + " account: " + iniAmount;
    }
}
