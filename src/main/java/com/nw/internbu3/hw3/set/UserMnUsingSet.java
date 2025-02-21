package com.nw.internbu3.hw3.set;

import com.nw.internbu3.hw1.user.User;

import java.util.HashSet;
import java.util.Set;

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

    public String isEmailExist(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return "exists";
            }
        }
        return "don't exist";
    }
}
