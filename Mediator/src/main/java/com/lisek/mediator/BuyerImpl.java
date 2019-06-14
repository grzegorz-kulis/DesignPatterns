package com.lisek.mediator;

public class BuyerImpl extends Buyer {

    public BuyerImpl(String name, Mediator mediator) {
        super(name, mediator);
    }

    void bid(int price) {
        this.price = price;
    }

    void cancel() {
        this.price = -1;
        System.out.println(name + " cancelled his offer!");
    }

    void notification() {
        System.out.println("Auction is over " + this.name);
    }
}
