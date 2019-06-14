package com.lisek.mediator;

public class Main {

    public static void main(String[] args) {

        Mediator mediator = new MediatorImpl();

        Buyer b1 = new BuyerImpl("Adam", mediator);
        Buyer b2 = new BuyerImpl("Bartosz", mediator);
        Buyer b3 = new BuyerImpl("Ewa", mediator);
        Buyer b4 = new BuyerImpl("Marta", mediator);

        mediator.addBuyer(b1);
        mediator.addBuyer(b2);
        mediator.addBuyer(b3);
        mediator.addBuyer(b4);

        b1.bid(100);
        b2.bid(80);
        b3.bid(150);
        b4.bid(110);

        mediator.findHighestBid();

        b3.cancel();

        mediator.findHighestBid();

    }
}
