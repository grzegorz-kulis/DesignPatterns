package com.lisek.command;

public class Buy implements Order {

    private Stock stock;

    public Buy(Stock stock) {
        this.stock = stock;
    }

    public void execute() {
        stock.buying();
    }
}
