package com.nw.internbu3.hw1.user;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class User {
    private String username;
    private String email;
    private String password;

    protected User(String username, String email, String password) {
        // Private constructor to enforce usage of createAccount
    }

    public static User createAccount(String username, String email, String password) {
        User newUser = new User(username, email, password);
        newUser.setUsername(username);
        newUser.setEmail(email);
        newUser.setPassword(password);
        return newUser;
    }

    public void login(String password) {
        boolean equals = this.password.equals(hashPassword(password));
        if (equals) {
            System.out.println("Logged in successfully");
        } else {
            System.out.println("Login failed");
        }

    }
    /**
     * Phương thức này thực hiện băm mật khẩu đầu vào bằng thuật toán SHA-256
     * @param password
     * @return mã hexadecimal
     */
    private String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) hexString.append('0');
                hexString.append(hex);
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = hashPassword(password);
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
