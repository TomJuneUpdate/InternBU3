package com.nw.internbu3.hw1;

import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private String category;
    private int stock;

    public Product(String name, double price, String category, int stock) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.name = name;
        this.price = price;
        this.category = category;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * Ghi đè phương thức equals và hashCode để đảm bảo HashSet nhận diện sản phẩm trùng lặp theo ID
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Product product = (Product) obj;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }

    // Phương thức hiển thị thông tin sản phẩm
    public void displayProductInfo() {
        System.out.println("Product Information:");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price +" đ");
        System.out.println("Category: " + category);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        System.out.println("Hello World 2");
    }
}
