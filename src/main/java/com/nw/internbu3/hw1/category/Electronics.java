package com.nw.internbu3.hw1.category;

import com.nw.internbu3.hw1.Product;

public class Electronics extends Product {
    private String brand;
    private int warranty; // Bảo hành (tháng)

    public Electronics(String name, double price, String brand, int warranty, int stock) {
        super(name, price, "Electronics", stock);
        this.brand = brand;
        this.warranty = warranty;
    }

    public String getBrand() {
        return brand;
    }

    public int getWarranty() {
        return warranty;
    }

    @Override
    public String toString() {
        return "Electronics{" +
                super.toString() +
                "brand='" + brand + '\'' +
                ", warranty=" + warranty +
                '}';
    }
}
