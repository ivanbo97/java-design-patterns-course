package com.ivanboyukliev.behavioralpatterns.command.courseassignment;

import java.util.ArrayList;
import java.util.List;

// Invoker
public class Broker {
    private List<Order> orders;

    public Broker() {
        orders = new ArrayList<>();
    }

    public void takeOrder(Order newOrder) {
        orders.add(newOrder);
    }

    public void executeOrders() {
        System.out.println("Executing orders....");
        for (Order order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
