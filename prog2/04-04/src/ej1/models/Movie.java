package ej1.models;

public class Movie {
    private String title;
    private String actor;
    private String director;
    private int year;

    public Movie(String title, String actor, String director, int year) {
        this.title = title;
        this.actor = actor;
        this.director = director;
        this.year = year;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void printDetails() {
        System.out.println("Title: " + this.title);
    }

    public static Movie searchByTitle(Movie[] movies, String title) {
        Movie result = null;
        for (int i = 0; i < movies.length; i++) {
            if(movies[i].title.equalsIgnoreCase(title)){
                result = movies[i];
                break;
            }
        }
        return result;
    }
}