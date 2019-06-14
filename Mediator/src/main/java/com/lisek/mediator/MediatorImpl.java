package com.lisek.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediatorImpl implements Mediator {

    private List<Buyer> buyerList;

    public MediatorImpl() {
        this.buyerList = new ArrayList<Buyer>();
    }

    public void addBuyer(Buyer buyer) {
        this.buyerList.add(buyer);
        System.out.println(buyer.getName() + "was added to the list.");
    }

    public void findHighestBid() {
        int maxBid = 0;
        Buyer winner = null;

        for (Object b : this.buyerList) {
            Buyer a = (Buyer) b;
            if (a.getPrice() > maxBid) {
                maxBid = a.getPrice();
                winner = a;
            }
        }

        System.out.println("Auction winner is: " + winner.getName() + ". He paid " + winner.getPrice());

        for (Buyer b : this.buyerList) {
            b.notification();
        }
    }
}
