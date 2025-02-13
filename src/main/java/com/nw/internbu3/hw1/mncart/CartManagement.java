package com.nw.internbu3.hw1.mncart;

import com.nw.internbu3.hw1.Product;

import java.util.ArrayList;
import java.util.List;

public class CartManagement implements Cart{

    private List<CartItem> cartItems;

    private CartManagement() {
        this.cartItems = new ArrayList<>();
    }

    public static CartManagement createCart() {
        return new CartManagement();
    }

    @Override
    public void addProduct(Product product, int quantity) {
        for (CartItem cartItem : cartItems) {
            if (cartItem.getProduct().equals(product)) {
                cartItem.setQuantity(cartItem.getQuantity() + quantity);
                return;
            }
        }
        cartItems.add(new CartItem.Builder().setProduct(product).setQuantity(quantity).build());
    }

    @Override
    public void removeProduct(Product product) {
        for (CartItem cartItem : cartItems)
            if (cartItem.getProduct().equals(product)) {
                cartItems.remove(cartItem);
            }
    }

    @Override
    public double getTotalPrice() {
        double totalPrice = 0;
        for (CartItem cartItem : cartItems) {
           totalPrice += cartItem.getProduct().getPrice() * cartItem.getQuantity();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CartManagement{\n");

        for (CartItem cartItem : cartItems) {
            stringBuilder.append("  ").append(cartItem.toString()).append("\n");
        }

        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public List<CartItem> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<CartItem> cartItems) {
        this.cartItems = cartItems;
    }
}
