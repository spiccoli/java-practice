package ej;

public class Movie implements Comparable<Movie> {
//Attributes.
    private int year;
    public int getYear() {
        return year;
    }
//Constructor.
    public Movie(int year) {
        this.year = year;
    }

    @Override
    public int compareTo(Movie m) {
        return Integer.compare(this.year, m.year);
    }

    @Override
    public String toString() {
        return "ej.Movie(" + year + ")";
    }
}
