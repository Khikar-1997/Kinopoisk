package com.company.movie;

import com.company.Genre;
import com.company.user.User;

import java.util.Objects;
import java.util.UUID;

public class Movie extends User {
    private String uuid;
    private String name;
    private Genre genre;
    private double duration;

    public Movie(String name, Genre genre, double duration) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.genre = genre;
        this.duration = duration;
    }

    public Movie() {
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return Double.compare(movie.duration, duration) == 0 &&
                Objects.equals(uuid, movie.uuid) &&
                Objects.equals(name, movie.name) &&
                genre == movie.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, genre, duration);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", genre=" + genre +
                ", duration=" + duration +
                '}';
    }
}
