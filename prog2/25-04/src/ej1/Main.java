package ej1;

// This lecture taught composition & aggregation adding it to the program made on 04/04

import ej1.models.Director;
import ej1.models.Movie;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String name = sc.nextLine();
        System.out.println("Enter movie actor: ");
        String actor = sc.nextLine();
        System.out.println("Enter movie's director's name, lastname, age, nationality");
        Director director = new Director(sc.nextLine(),sc.nextLine(),sc.nextLine(),sc.nextLine());
        System.out.println("Enter movie year: ");
        int year = sc.nextInt();
        Movie[] movies = null;
        while(true){
            Movie myMovie = new Movie(name, actor, director, year);
            System.out.println("Movie created successfully: " + myMovie.getTitle()
                    + " " + myMovie.getActor()
                    + " " + myMovie.getDirector().getName()
                    + " " + myMovie.getYear()
            );
            System.out.println("If you want to stop adding movies, please enter number 0: ");
            int number = sc.nextInt();
            if(number == 0){
                break;
            }
        }

        System.out.println("Enter movie title to look for:");
        String title = sc.nextLine();

        Movie movieFound = Movie.searchByTitle(movies, title);
        if(movieFound == null){
            System.out.println("Movie not found");
        } else {
            System.out.println("Movie found:");
            movieFound.printDetails();

        }
    }
}