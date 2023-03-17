package org.example;


class Review {
   boolean reviewText;
    boolean rating;
    boolean reviewCreatedOnDate;

    public Review(boolean reviewText, boolean rating, boolean date) {
        this.reviewText = Boolean.parseBoolean(String.valueOf(reviewText));
        this.rating = Boolean.parseBoolean(String.valueOf(rating));
        this.reviewCreatedOnDate = Boolean.parseBoolean(String.valueOf(reviewCreatedOnDate));
    }

    public boolean getText() {
        return reviewText;
    }

    public boolean getRating() {
        return rating;
    }

    public boolean getDate() {
        return reviewCreatedOnDate;
    }

    @Override
    public String toString() {
        return "Prioritize by text: " + reviewText + "\n" +
                "Order by rating: " + rating + "\n" +
                "Order by date: " + reviewCreatedOnDate ;

    }
}

}
