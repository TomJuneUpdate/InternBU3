package com.nw.internbu3.hw3.set;

import com.nw.internbu3.hw1.order.Order;
import com.nw.internbu3.hw1.order.Status;

import java.util.LinkedHashSet;
import java.util.Set;

public class OrderManager {
    private Set<Order> completedOrders = new LinkedHashSet<>();

    public void completeOrder(Order order) {
        if (order.getStatus() == Status.COMPLETED) {
            completedOrders.add(order);
        }
    }

    public void showCompletedOrders() {
        if (completedOrders.isEmpty()) {
            System.out.println("NA");
            return;
        }
        completedOrders.forEach(System.out::println);
    }
}
