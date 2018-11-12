package com.optionsquared.access;

public class Review {

    private int rating;
    private String text;
    private long time;
    private String name;
    private boolean isReview;
    // TODO: add way of storing photo, possibly just string id of location in firebase database

    Review(int rating, String text, long time, String name, boolean isReview) {
        this.rating = rating;
        this.text = text;
        this.time = time;
        this.name = name;
        this.isReview = isReview;
    }

    //TODO: add getters and setters

    public int getRating() {
        return this.rating;
    }
}
