package com.nw.internbu3.hw1;

import java.util.List;

public class Customer extends User{
    private List<String> permissions;

    public Customer(String username, String email, String password) {
        super(username, email, password);
        this.permissions = List.of("BUY_PRODUCTS", "WRITE_REVIEWS");
    }

    public List<String> getPermissions() {
        return permissions;
    }
}
