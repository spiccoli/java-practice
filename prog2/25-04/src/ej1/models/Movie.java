package ej1.models;

public class Movie {
    private String title;
    private String actor;
    private Director director;
    private int year;

    public Movie(String title, String actor, Director director, int year) {
        this.title = title;
        this.actor = actor;
        this.director = director;
        this.year = year;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
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
        System.out.println("---Movie---");
        System.out.println("Title: " + this.title);
        System.out.println("Actor: " + this.actor);
        System.out.println("Year: " + this.year);
        this.director.printDetails();
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