package inheritance;

import java.util.ArrayList;

public class Theater {
    String name;
    ArrayList<String> movies = new ArrayList<>();

    public Theater(String name)
    {
        this.name = name;
    }

    public String toString()
    {
        String theaterString;
        String movieString = "";
        if(movies)
        {
            for(String movie : movies)
            {
                movieString += (movie +"\n");
            }
        }
        theaterString = (
            "Theater: "+ this.name +
            "\nMovies: "+ movieString
        );
        return theaterString;
    }

    public void addMovie(String movieToAdd)
    {
        this.movies.add(movieToAdd);
    }

    public void removeMovie(String movieToRemove)
    {
        this.movies.remove(this.movies.indexOf(movieToRemove));
    }
}