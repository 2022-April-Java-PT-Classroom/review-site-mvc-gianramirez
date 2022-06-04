package org.wecancoeit.reviews.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
    @Id
    @GeneratedValue

    private Long id;
    private String title;
    private String imageUrl;
    private String reviewCategory;
    private String content;
    private String country;
    private String strength;

    public Review(String title, String imageUrl, String reviewCategory, String content, String country, String strength) {
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
        this.country = country;
        this.strength = strength;
    }

    public Review() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }

    public String getCountry() {
        return country;
    }

    public String getStrength() {
        return strength;
    }
}
