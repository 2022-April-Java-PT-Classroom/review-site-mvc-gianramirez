package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;
import org.wecancoeit.reviews.model.Review;
import org.wecancoeit.reviews.repo.ReviewRepository;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTimeout;

public class ReviewRepositoryTest {

    private ReviewRepository underTest;
    private Review reviewOne = new Review(1L, "review title", "imageurl", "review category", "content", "country");
    private Review reviewTwo = new Review(2L, "review title", "imageurl", "review category", "content", "country");

    @Test
    public void shouldFindReviewOne(){
        underTest = new ReviewRepository(reviewOne);
        Review foundReview = underTest.findOne(1L);
        assertEquals(reviewOne, foundReview);
    }

    @Test
    public void shouldFindReviewOneAndReviewTwo(){
        underTest = new ReviewRepository(reviewOne, reviewTwo);
        Collection<Review> foundReviews = underTest.findAll();
        assertThat(foundReviews).contains(reviewOne, reviewTwo);
    }


}
