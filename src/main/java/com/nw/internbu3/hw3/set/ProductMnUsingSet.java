package com.nw.internbu3.hw3.set;

import com.nw.internbu3.hw1.Product;

import java.util.HashSet;
import java.util.Set;

public class ProductMnUsingSet {
    private Set<Product> productSet;

    public ProductMnUsingSet() {
        this.productSet = new HashSet<>();
    }

    /**
     * Thêm sản phẩm vào danh sách, nếu sản phẩm trùng ID sẽ không được thêm
     */
    public void addProduct(Product product) {
        if (productSet.add(product)) {
            System.out.println("Đã thêm sản phẩm: " + product);
        } else {
            productSet.remove(product);
            productSet.add(product);
            System.out.println("Sản phẩm đã tồn tại: " + product);
        }
    }

    @Override
    public String toString() {
        return "ProductMnUsingSet{" +
                "productSet=" + productSet.toString() +
                '}';
    }

    public static void main(String[] args) {
        ProductMnUsingSet productMnUsingSet = new ProductMnUsingSet();
        Product laptop = new Product("Laptop", 1500, "Electronics", 5);
        Product pc = new Product("Laptop", 1500, "Electronics", 10);
        Product phone = new Product("Phone", 800, "Electronics", 10);
        Product book = new Product("Java Programming", 5, "Books", 20);
        productMnUsingSet.addProduct(laptop);
        productMnUsingSet.addProduct(pc);
        productMnUsingSet.addProduct(phone);
        productMnUsingSet.addProduct(book);
        System.out.println(productMnUsingSet);
    }
}
