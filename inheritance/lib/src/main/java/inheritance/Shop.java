package inheritance;

import java.util.ArrayList;

public class Shop {
    String name;
    String description;
    float price;
    float rating;
    ArrayList<Review> reviews = new ArrayList<>();

    public Shop(String name, String description, float price)
    {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String toString()
    {
        String shopString;
        shopString = (
            "Shop: "+ this.name +
            "\nAbout: "+ this.description +
            "\nPrice: " + "$".repeat(this.price)
        );
        return shopString;
    }

    public void addReview(float rating, String body, String author)
    {
        Review newReview = new Review(rating, body, author);
        this.reviews.add(newReview);
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