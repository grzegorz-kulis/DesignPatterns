package com.lisek.command;

public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock(5);
        Broker broker = new Broker();

        broker.takeOrder(new Sell(stock));
        broker.takeOrder(new Buy(stock));
        broker.takeOrder(new Sell(stock));
        broker.takeOrder(new Buy(stock));
        broker.takeOrder(new Sell(stock));

        broker.executeOrder();


        System.out.println("Left in stock: " + stock.getQuantity());
    }
}
