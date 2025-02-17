package com.nw.internbu3.hw1.order;

import com.nw.internbu3.hw1.user.User;
import com.nw.internbu3.hw1.mncart.CartManagement;

public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private User user;
    private CartManagement cart;
    private double totalPrice;
    private Status status;

    public Order(User user, CartManagement cart, Status status) {
        this.orderId = orderCounter++;
        this.user = user;
        this.cart = cart;
        this.totalPrice = cart.getTotalPrice();
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public CartManagement getCart() {
        return cart;
    }

    public void setCart(CartManagement cart) {
        this.cart = cart;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", user=" + user.getUsername() +
                ", totalPrice=" + totalPrice +
                ", status=" + status +
                '}';
    }

}
