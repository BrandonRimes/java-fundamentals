package inheritance;

public class Review()
{
    String movie = "";
    float rating;
    String body;
    String author;

    public Review(float rating, String body, String author, String movie)
    {
        this.movie = movie;
        this.rating = rating;
        this.body = body;
        this.author = author;
    }

    public String toString()
    {
        return
        (
            this.rating +"Stars\n"+
            this.body +"\n"+
            this.author
        )
    }


}