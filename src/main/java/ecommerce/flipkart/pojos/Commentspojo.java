package ecommerce.flipkart.pojos;

import org.springframework.stereotype.Component;

@Component
public class Commentspojo {
    String username;
    String comment;
    double rating;

    public Commentspojo(String username, String comment, double rating) {
        this.username = username;
        this.comment = comment;
        this.rating = rating;
    }

    public Commentspojo() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
