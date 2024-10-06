package fr.epita.bank.datamodel;

public class StockOrder {
    private int quantity;
    private double unitPrice;
    private double commission;

    private InvestmentAccount account;

    public StockOrder(int quantity, double unitPrice, double commission, InvestmentAccount account, Stock stock) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.commission = commission;
        this.account = account;
        this.stock = stock;

        double newBalance = account.getBalance() - ((unitPrice*quantity) + (commission*quantity*unitPrice)/100);
        account.setBalance(newBalance);

    }

    private Stock stock;
}
