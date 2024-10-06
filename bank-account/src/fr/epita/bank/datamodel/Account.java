package fr.epita.bank.datamodel;

import java.math.BigDecimal;

public class Account { // Public is also Access Modifier
    private double balance;// private is a function and BigDecimal supports arbitrary-precision numbers, which allows it to handle very large or very small values with exact precision
    // Private is Access Modifier when we define property "balance"
    // all property we need to assign data type. Ex: double
    private Customer owner;
    // Every class need to have a constructor because it is a function that is always called when we create an object or instant of that class
    // right click --> generate --?constructor

    public Account(double balance, Customer owner) {
        this.balance = balance;
        this.owner = owner;
    }
    //setBalance is used for updating the value of a property "balance"
    public void setBalance(double balance) {
        if (balance > 0) { // we want to check of the updated balance is grater than 0 otherwise the new value  cannot be updated
            this.balance = balance;
        }
    }
    //getBalance is used for get back/return the value of a property "balance"
    public double getBalance() {
        return this.balance;
    }
}

