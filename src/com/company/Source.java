package com.company;

import com.company.movie.Movie;
import com.company.user.User;

import java.util.List;
import java.util.Objects;

public class Source {
    private static Source instance = null;
    private List<User> users;
    private List<Movie> movies;

    private Source(List<User> users, List<Movie> movies) {
        this.users = users;
        this.movies = movies;
    }

    public static Source getInstance(List<User> users,List<Movie> movies){
        if (instance == null){
            instance = new Source(users,movies);
            return instance;
        } else {
            return instance;
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return Objects.equals(users, source.users) &&
                Objects.equals(movies, source.movies);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users, movies);
    }

    @Override
    public String toString() {
        return "Source{" +
                "users=" + users +
                ", movies=" + movies +
                '}';
    }
}
