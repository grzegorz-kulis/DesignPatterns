package com.lisek.command;

import java.util.Optional;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Broker {

    private Queue<Order> orderList = new LinkedBlockingDeque<>();

    public void executeOrder() {
        while (!orderList.isEmpty()) {
            Optional<Order> orderOptional = Optional.ofNullable(orderList.poll());
            orderOptional.ifPresent(Order::execute);
        }
    }

    public void takeOrder(Order order) {
        this.orderList.offer(order);
    }
}
