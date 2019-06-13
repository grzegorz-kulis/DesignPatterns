package com.lisek.command;

public class Sell implements Order {

    private Stock stock;

    public Sell(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.selling();
    }
}
