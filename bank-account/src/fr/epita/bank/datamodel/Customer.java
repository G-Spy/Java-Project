package fr.epita.bank.datamodel;

public class Customer {
    String name;
    String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Welcome customer [name=" + name + ", address=" + address + "]";
    }
}




