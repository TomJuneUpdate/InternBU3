package com.nw.internbu3.hw1.user;

import java.util.List;

public class Admin extends User {
    private List<String> permissions;

    public Admin(String username, String email, String password) {
        super(username, email, password);
        this.permissions = List.of("MANAGE_PRODUCTS", "MANAGE_ORDERS");
    }

    public List<String> getPermissions() {
        return permissions;
    }
}
