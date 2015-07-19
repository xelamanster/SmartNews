package store.model;

/**
 * Created by fein on 6/27/2015.
 */
public class Review {
    private final int reviewId;
    private final String author;
    private final String message;
    private final int stars;

    public Review(int reviewId, String author, String message, int stars) {
        this.reviewId = reviewId;
        this.author = author;
        this.message = message;
        this.stars = stars;
    }

    public int getReviewId() {
        return reviewId;
    }

    public String getAuthor() {
        return author;
    }

    public String getMessage() {
        return message;
    }

    public int getStars() {
        return stars;
    }
}
