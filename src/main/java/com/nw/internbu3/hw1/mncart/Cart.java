package com.nw.internbu3.hw1.mncart;

import com.nw.internbu3.hw1.Product;

public interface Cart {
    void addProduct(Product product, int quantity);
    void removeProduct(Product product);
    double getTotalPrice();
}
