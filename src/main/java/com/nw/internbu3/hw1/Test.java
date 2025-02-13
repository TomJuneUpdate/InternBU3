package com.nw.internbu3.hw1;

import com.nw.internbu3.hw1.mncart.CartManagement;
import com.nw.internbu3.hw1.order.Order;
import com.nw.internbu3.hw1.order.Status;

public class Test {
    public static void main(String[] args) {
        // Ex1
        User user1 = User.createAccount("Tom", "john@example.com","1");
        user1.login("1");
        // Tạo các đối tượng sản phẩm
        Product laptop = new Product("Laptop", 1500, "Electronics", 5);
        Product phone = new Product("Phone", 800, "Electronics", 10);
        Product book = new Product("Java Programming", 5, "Books", 20);
        laptop.displayProductInfo();

        // Tạo giỏ hàng
        CartManagement cart1 = CartManagement.createCart();
        CartManagement cart2 = CartManagement.createCart();

        // Thêm sản phẩm vào giỏ hàng 1
        cart1.addProduct(laptop, 1);
        cart1.addProduct(phone, 2);
        cart1.addProduct(book, 3);

        // Thêm sản phẩm vào giỏ hàng 2
        cart2.addProduct(phone, 1);
        cart2.addProduct(book, 5);

        // Hiển thị tổng giá của từng giỏ hàng
        System.out.println("Cart 1 Total Price: " + cart1.getTotalPrice() + " đ");
        System.out.println("Cart 2 Total Price: " + cart2.getTotalPrice() + " đ");
        System.out.println("Cart 1: " + cart1.toString());

        // Tao order cart 1
        Order order1 = new Order(user1, cart1, Status.PROCESSING);
        System.out.println(order1.toString());
        // Cap nhap trang thai don hang
        order1.setStatus(Status.SHIPPED);

    }
}
