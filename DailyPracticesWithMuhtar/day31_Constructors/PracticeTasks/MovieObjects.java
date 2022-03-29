package day31_Constructors.PracticeTasks;

import java.util.Arrays;

public class MovieObjects {
    public static void main(String[] args) {
        Movie movie1 = new Movie("USA", "Journey to SDET: Cydeo EU08", "10/08/2022", "Kuzzat Altay");

        movie1.genre.addAll(Arrays.asList("Adventure", "Comedy", "Thriller"));

        movie1.casts.addAll(Arrays.asList("Oscar", "Luna", "Asiya", "Adam", "Muhtar"));
        System.out.println(movie1);
    }
}