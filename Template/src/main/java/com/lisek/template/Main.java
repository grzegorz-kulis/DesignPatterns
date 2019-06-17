package com.lisek.template;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate netOrder = new NetOrder();
        netOrder.processOrder();

        OrderProcessTemplate storeOrder = new StoreOrder();
        storeOrder.processOrder();
    }
}
