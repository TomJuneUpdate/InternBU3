package com.nw.internbu3.hw1.Category;

import com.nw.internbu3.hw1.Product;

public class Clothing extends Product {
    private int size;
    private String material;
    public Clothing(String name, double price, int stock, int size, String material ) {
        super(name, price,"Clothing", stock);
        this.size = size;
        this.material = material;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Clothing{" +
                super.toString() +
                "size=" + size +
                ", material='" + material + '\'' +
                '}';
    }
}
