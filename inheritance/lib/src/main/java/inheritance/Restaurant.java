package inheritance;

import java.util.ArrayList;

public class Restaurant
{
    String name;
    float rating;
    float price;
    ArrayList<Review> reviews;

    public Restaurant(String name, float price)
    {
        this.name = name;
        this.price = price;
        this.rating = null;
    }

    public String toString()
    {
        return
        (
            "Restaurant: "+ this.name +
            "\nPrice (1-3): "+ this.price +
            "\nRating (0-5): "+ this.rating
        );
    }

    public void addReview(float rating, String body, String author)
    {
        Review newReview = new Review(rating, body, author);
        this.reviews.push(newReview);
        calcRating();
    }

    public void calcRating()
    {
        int ratingTotal;
        for(Review review : this.reviews)
        {
            ratingTotal += review.rating;
        }
        this.rating = ratingTotal/this.reviews.size();
    }
}