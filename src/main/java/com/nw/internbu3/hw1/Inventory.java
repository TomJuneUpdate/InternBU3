package com.nw.internbu3.hw1;

import com.nw.internbu3.hw1.mncart.CartItem;
import com.nw.internbu3.hw1.order.Order;

public class Inventory {

    // Kiem tra ton kho
    public static int checkStock(Product product) {
        return product.getStock();
    }
    // Them hang
    public static void restock(Product product,int quantity){
        if (quantity <= 0) {
            System.out.println("Invalid restock quantity!");
            return;
        }
        product.setStock(product.getStock() + quantity);
    }
    // Xuất hàng
    public static void deductStock(Order order) {
        for (CartItem item : order.getCart().getCartItems()) {
            Product product = item.getProduct();
            int quantityToDeduct = item.getQuantity();
            int currentStock = product.getStock();

            if (currentStock >= quantityToDeduct) {
                product.setStock(currentStock - quantityToDeduct);
                System.out.println("Xuất hàng: " + product.getName() + " - Số lượng: " + quantityToDeduct);
            } else {
                System.out.println("Không đủ hàng trong kho cho sản phẩm: " + product.getName());
            }
        }
    }
}
