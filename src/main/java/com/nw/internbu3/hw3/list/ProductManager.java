package com.nw.internbu3.hw3.list;

import com.nw.internbu3.hw1.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductManager {
    private List<Product> listProduct = new ArrayList<>();

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    /**
     * So sanh dia chi bo nho co the gay loi
     * @param product
     */
    public void removeProduct(Product product) {
        listProduct.remove(product);
    }

    /**
     * List sản phẩm có giá cao nhất trong danh sách
     * @return Most expensive product
     */
    public List<Product> findMostExpensiveProduct() {
        if (listProduct.size() == 0) {
            return null;
        }
        List<Product> mostExpensiveProduct = new ArrayList<>();
        double max = listProduct.get(0).getPrice();
        for (Product product : listProduct) {
            if (product.getPrice() > max) {
                max = product.getPrice();
            }
        }
        for (Product product : listProduct) {
            if (product.getPrice() == max) {
                mostExpensiveProduct.add(product);
            }
        }
        return mostExpensiveProduct;
    }

    /**
     * Lọc danh sách sản phẩm theo danh mục.
     *
     * @param category Tên danh mục cần lọc
     * @return Danh sách sản phẩm thuộc danh mục cụ thể
     */
    public List<Product> filterProductsByCategory(String category) {
        List<Product> products = new ArrayList<>();
        for (Product product : listProduct) {
            if (product.getCategory().equals(category)) {
                products.add(product);
            }
        }
        return products;
    }
    /**
     * Sắp xếp danh sách sản phẩm theo giá tăng dần
     */
    public void sortProductsByPriceAscending() {
        Collections.sort(listProduct, Comparator.comparingDouble(Product::getPrice));
    }

    @Override
    public String toString() {
        return "ProductManager{" +
                "listProduct=" + listProduct.toString() +
                '}';
    }

    public static void main(String[] args) {
        //Test list
        Product laptop = new Product("Laptop", 1500, "Electronics", 5);
        Product pc = new Product("PC", 1500, "Electronics", 5);
        Product phone = new Product("Phone", 800, "Electronics", 10);
        Product book = new Product("Java Programming", 5, "Books", 20);
        ProductManager pm = new ProductManager();
        pm.addProduct(laptop);
        pm.addProduct(phone);
        pm.addProduct(book);
        pm.addProduct(pc);
        System.out.println(pm);
        System.out.println(pm.findMostExpensiveProduct());
        pm.removeProduct(laptop);
        System.out.println(pm);
        System.out.println(pm.filterProductsByCategory("Electronics"));
        pm.sortProductsByPriceAscending();
        System.out.println(pm);
    }
}
