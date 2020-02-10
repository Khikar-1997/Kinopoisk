package com.company;

import com.company.movie.Movie;
import com.company.movie.MovieService;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie();
        Movie movie2 = new Movie();
        Movie movie3 = new Movie();
        Movie movie4 = new Movie();

        MovieService.create(movie1);
        MovieService.create(movie2);
        MovieService.create(movie3);
        MovieService.create(movie4);

        Source instance = Source.getInstance(new ArrayList<>(), new ArrayList<>());
        instance.getMovies().forEach(System.out::println);
    }
}
