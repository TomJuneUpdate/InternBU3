package com.nw.internbu3.hw1.review;

import com.nw.internbu3.hw1.Product;
import com.nw.internbu3.hw1.User;

import java.time.LocalDateTime;

public class Review {
    private User user;
    private Product product;
    private int rating;
    private String comment;
    private LocalDateTime createdAt;

    public Review(User user, Product product, int rating, String comment) {
        if (rating < 1 || rating > 5) {
            throw new IllegalArgumentException("Rating must be between 1 and 5");
        }
        this.user = user;
        this.product = product;
        this.rating = rating;
        this.comment = comment;
        this.createdAt = LocalDateTime.now();
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public int getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return "Review{" +
                "user=" + user.getUsername() +
                ", product=" + product.getName() +
                ", rating=" + rating +
                ", comment='" + comment + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
