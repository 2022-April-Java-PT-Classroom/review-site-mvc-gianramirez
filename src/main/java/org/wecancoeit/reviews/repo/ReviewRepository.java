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
        Review one = new Review(1L, "Arturo Fuente Curley Head Maduro", "/images/Arturo-Fuente-Curly-Head-Deluxe.jpg", "Strength: Medium", "Country: Dominican", "This is a great smoke for a great price. This cigar has a deep robust flavor and a good even draw.");
        Review two = new Review(2L, "Dias de Gloria by AJ Fernandez Robusto", "/images/aj-fernandez-dias-de-gloria.png", "Strength: Medium-Full", "Country: Nicaragua", "With this smoke you will experience a toasty, medium flavor with notes of vanilla, leather, earth and pepper.");
        Review three = new Review(3L, "Cohiba Connecticut Robusto", "/images/Cohiba-Connecticut-Robusto.png", "Strength: Full", "Country: Honduras", "This cigar is light for a Cohiba, but you can expect flavor full of cream, toast, nuts and a subtle spice perfect for pairing with a cup of coffee.");
        Review four = new Review(4L, "Camacho Corojo Robusto", "/images/Camacho-Corojo-Robusto.jpg", "Strength: Full", "Country: Honduras", "Camacho is a real powerhouse, delivering great flavor of sweet wood, cedar, walnuts, leather and steel.");


        reviewsList.put(one.getId(), one);
        reviewsList.put(two.getId(), two);
        reviewsList.put(three.getId(), three);
        reviewsList.put(four.getId(), four);
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
