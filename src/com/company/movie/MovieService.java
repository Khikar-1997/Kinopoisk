package com.company.movie;

import com.company.Source;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {
    public static void create(Movie movie){
        movie = Initializer.initializeMovies();
        Source instance = Source.getInstance(new ArrayList<>(), new ArrayList<>());
        instance.getMovies().add(movie);
    }

//    public static List<Movie> findAll(){
//        LinkedList<Movie> movies
//    }
}
