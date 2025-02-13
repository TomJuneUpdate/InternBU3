package com.nw.internbu3.hw1;

import com.nw.internbu3.hw1.mncart.CartManagement;

public class Discount {
    public double applyDiscount(Product product, double percentage) {
        if (percentage < 0 || percentage > 100) {
            System.out.println("Invalid discount percentage!");
            return percentage;
        }
        return product.getPrice() * percentage / 100;
    }

    public double applyBulkDiscount(CartManagement cart) {
        if (cart.getTotalPrice() > 1000) {
            return cart.getTotalPrice() * 0.8;
        }
        return cart.getTotalPrice();
    }
}
