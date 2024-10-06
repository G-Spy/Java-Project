package fr.epita.bank.launcher;

import fr.epita.bank.datamodel.*;

public class Launcher {
    public static void main(String[] args) {
//        Customer sreymouy = new Customer("Sreymouy", "Paris");// Customer id equal to Type ; new Customer is instance that is assigned to Type/Customer
//        System.out.println(sreymouy);
//        SavingAccount sreymouySavingAccount = new SavingAccount(1300.0, sreymouy, 0.2);
//        System.out.println(sreymouySavingAccount.getBalance());
//        sreymouySavingAccount.setBalance(-1500.0);
//        System.out.println(sreymouySavingAccount.getBalance());


        //-------------
        //Practice Exercise
        //-------------
        // do a scenario where a customer buys some stock action of gold ("GOLD"}
        // with unit price 25 euros from his investment account, initialize with 3045 euros
        // he buys 5 stock actions
        // Display the final balance in the console
        Customer customer1 = new Customer("John", "Marseille");
        InvestmentAccount investmentAccountCustomer1 = new InvestmentAccount(5000.0, customer1);
        Stock stockGold = new Stock(25.0, "GOLD");
        StockOrder stockOrderCustomer1 = new StockOrder( 5, 25.0, 0.2, investmentAccountCustomer1, stockGold  );
        System.out.println(investmentAccountCustomer1.getBalance());






    }
}
