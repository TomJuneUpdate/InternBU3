package com.nw.internbu3.hw1.payment;

public class CreditCardPayment extends Payment {
    private String cardNumber;
    private String cardHolder;
    private String expiryDate;
    public CreditCardPayment(double amount,String cardNumber, String cardHolder, String expiryDate) {
        super(amount);
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.expiryDate = expiryDate;
    }

    @Override
    public void processPayment() {
        System.out.println("Processing Credit Card Payment...");
    }
}
