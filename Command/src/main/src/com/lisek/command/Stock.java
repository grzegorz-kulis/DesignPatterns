package com.lisek.command;

public class Stock {

    private int quantity;

    public Stock(int quantity) {
        this.quantity = quantity;
    }

    public void selling() {
        System.out.println("Selling! Remaining quantity is " + --this.quantity);
    }

    public void buying() {
        System.out.println("Buying! Current quantity is " + ++this.quantity);
    }

    public int getQuantity() {
        return quantity;
    }
}
