package com.lisek.mediator;


public abstract class Buyer {
    protected String name;
    protected int price;
    protected Mediator mediator;

    public Buyer(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    abstract void bid(int price);
    abstract void cancel();
    abstract void notification();

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

}
