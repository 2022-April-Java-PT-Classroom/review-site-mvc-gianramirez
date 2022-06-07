package org.wecancoeit.reviews.repo;


import org.springframework.stereotype.Repository;
import org.wecancoeit.reviews.model.Review;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();

    public ReviewRepository(){
        Review one = new Review(1L, " this", "this", "this", "this", "this");

        reviewsList.put(one.getId(), one);
    }

    public ReviewRepository(Review ... reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(), review);
        }
    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }


    public Collection<Review> findAll() {
        return reviewsList.values();
    }



}
