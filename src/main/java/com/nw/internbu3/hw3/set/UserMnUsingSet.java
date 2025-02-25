package com.nw.internbu3.hw3.set;

import com.nw.internbu3.hw1.Product;
import com.nw.internbu3.hw1.user.User;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UserMnUsingSet {
    Set<User> users;

    public UserMnUsingSet(Set<User> users) {
        this.users = new HashSet<>();
    }

    public void addUser(User user) {
        if (users.add(user)){
            System.out.println("added user successfully");
        } else {
            System.out.println("user already exists");
        }
    }

    // bai8
    public String isEmailExist(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return "exists";
            }
        }
        return "don't exist";
    }

    /**
     * Dùng TreeSet<String> để lưu danh mục sản phẩm theo thứ tự bảng chữ cái.
     * @param list product
     * @return set
     */
    public Set<String> treeSetProduct(List<Product> products) {
        Set<String> set = new TreeSet<>();
        for (Product product : products) {
            set.add(product.getCategory());
        }
        return set;
    }

}
