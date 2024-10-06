package fr.epita.bank.datamodel;


public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(double balance, Customer owner, double interestRate) {
        super(balance, owner);
        this.interestRate = interestRate;
    }
}

