package com.optionsquared.access;

import java.util.ArrayList;

public class Place {
    private ArrayList<Review> reviews;
    private ArrayList<Review> issues;
    private double avgRating;

    Place() {
        reviews = new ArrayList<>();
        issues = new ArrayList<>();
        setRating();
    }

    public void addReview(Review r) {
        reviews.add(r);

        // recompute the average rating
        setRating();
    }

    public void addIssue(Review r) {
        issues.add(r);
    }


    public void setRating() {
        if(reviews.size() == 0) {
            return;
        } else {
            int sum = 0;
            for (Review r : this.reviews) {
                sum += r.getRating();
            }
            this.avgRating = sum / reviews.size();
        }
    }

}
