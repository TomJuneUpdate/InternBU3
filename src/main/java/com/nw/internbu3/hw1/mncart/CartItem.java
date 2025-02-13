package com.nw.internbu3.hw1.mncart;

import com.nw.internbu3.hw1.Product;

public class CartItem {
    private Product product;
    private int quantity;

    private CartItem(Builder builder) {
        this.product = builder.product;
        this.quantity = builder.quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    public static class Builder {
        private Product product;
        private int quantity;

        public Builder setProduct(Product product) {
            this.product = product;
            return this;
        }

        public Builder setQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public CartItem build() {
            return new CartItem(this);
        }
    }
    @Override
    public String toString() {
        return "{" +
                "product=" + product.getName() +
                " quantity=" + quantity +
                '}';
    }
}
