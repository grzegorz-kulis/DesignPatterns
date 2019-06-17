package com.lisek.template;

public class StoreOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("StoreOrder::doSelect()");
    }

    @Override
    void doPayment() {
        System.out.println("StoreOrder::doPayment()");
    }

    @Override
    void delivery() {
        System.out.println("StoreOrder::delivery()");
    }
}
