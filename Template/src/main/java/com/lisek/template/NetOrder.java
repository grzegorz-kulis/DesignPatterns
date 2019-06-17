package com.lisek.template;

public class NetOrder extends OrderProcessTemplate {

    @Override
    void doSelect() {
        System.out.println("NetOrder::doSelect()");
    }

    @Override
    void doPayment() {
        System.out.println("NetOrder::doPayment()");
    }

    @Override
    void delivery() {
        System.out.println("NetOrder::delivery()");
    }
}
