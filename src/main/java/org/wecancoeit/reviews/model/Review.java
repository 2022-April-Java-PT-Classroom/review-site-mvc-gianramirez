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

    public Review(Long id, String title, String imageUrl, String reviewCategory, String country, String content) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.reviewCategory = reviewCategory;
        this.country = country;
        this.content = content;
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

    public String getCountry() {
        return country;
    }

    public String getContent() {
        return content;
    }



}
