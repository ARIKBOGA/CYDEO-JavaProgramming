package day31_Constructors.PracticeTasks;

import java.util.ArrayList;

public class Movie {
    public String country, title, releaseDate, director;
    public ArrayList<String> genre = new ArrayList<>();
    public ArrayList<String> casts = new ArrayList<>();

    public Movie(String country, String title, String releaseDate, String director) {
        this.country = country;
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
    }

    @Override
    public String toString() {
        return title + ", " + director + "\n" +
                genre + ", \n" + releaseDate + ", " +
                country + "\n" + casts;
    }
}