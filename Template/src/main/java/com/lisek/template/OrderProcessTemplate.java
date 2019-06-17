package com.lisek.template;

public abstract class OrderProcessTemplate {

    public final void processOrder() {
        doSelect();
        doPayment();
        delivery();
        giftWrapping();
        System.out.println("End of an order!");
    }

    abstract void doSelect();
    abstract void doPayment();
    abstract void delivery();

    private void giftWrapping() {
        System.out.println("Wrapping your package as a gift!");
    }
}
