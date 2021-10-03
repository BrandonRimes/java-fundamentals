package inheritance;

public class Review()
{
    String body;
    String author;
    float rating;

    public Review(float rating, String body, String author)
    {
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