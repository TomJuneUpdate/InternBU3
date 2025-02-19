package com.nw.internbu3.hw3.list;

import com.nw.internbu3.hw1.Product;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cart {
    private List<Product> cart = new LinkedList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }

    /**
     * So sanh dia chi bo nho co the gay loi
     * @param product
     */
    public void removeProduct(Product product) {
        cart.remove(product);
    }

    /**
     * Lấy sản phẩm đầu tiên trong giỏ hàng
     */
    public Product getFirstProduct() {
        return cart.isEmpty() ? null : cart.get(0);
    }

    /**
     * Lấy sản phẩm cuối cùng trong giỏ hàng
     */
    public Product getLastProduct() {
        return cart.isEmpty() ? null : cart.get(cart.size() - 1);
    }
}
