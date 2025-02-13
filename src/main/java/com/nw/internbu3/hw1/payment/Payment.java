package com.nw.internbu3.hw1.payment;

public abstract class Payment {
    protected double amount;

    public Payment(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        this.amount = amount;
    }

    public abstract void processPayment();
}
