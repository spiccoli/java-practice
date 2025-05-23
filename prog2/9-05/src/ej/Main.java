package ej;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Movie> myMovie = new ArrayList<Movie>();
        Movie movie1 = new Movie(44);
        myMovie.add(movie1);
        Movie movie2 = new Movie(50);
        myMovie.add(movie2);

        Movie movie3 = new Movie(30);
        myMovie.add(movie3);

        Collections.sort(myMovie);

        for (Movie movie : myMovie) {
            System.out.println(movie.getYear());
        }
    }
}