package ej1;

import ej1.models.Movie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie name: ");
        String name = sc.nextLine();
        System.out.println("Enter movie actor: ");
        String actor = sc.nextLine();
        System.out.println("Enter movie director: ");
        String director = sc.nextLine();
        System.out.println("Enter movie year: ");
        int year = sc.nextInt();

        Movie myMovie = new Movie(name, actor, director, year);
        System.out.println("Movie created successfully: " + myMovie.getTitle()
                                                    + " " + myMovie.getActor()
                                                    + " " + myMovie.getDirector()
                                                    + " " + myMovie.getYear()
        );
    }


}