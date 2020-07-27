package sg.edu.rp.c346.id18015170.mymovies;

import java.util.Calendar;

public class Movie {
    private String title;
    private int year;
    private String rated;
    private String genre;
    private Calendar watched_on;
    private String in_theatre;
    private String description;
    private int rating;

    public Movie(String title, int year, String rated, String genre, Calendar watched_on,
                 String in_theatre, String description, int rating) {
        this.title = title;
        this.year = year;
        this.rated = rated;
        this.genre = genre;
        this.watched_on = watched_on;
        this.in_theatre = in_theatre;
        this.description = description;
        this.rating = rating;

    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public String getRated() {
        return rated;
    }

    public String getGenre() {
        return genre;
    }

    public Calendar getWatched_on() {
        return watched_on;
    }

    public String getIn_theatre() {
        return in_theatre;
    }

    public String getDescription() {
        return description;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
