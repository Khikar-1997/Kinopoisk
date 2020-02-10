package com.company.user;

import com.company.movie.Movie;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class User {
    private String uuid;
    private String name;
    private List<Movie> favorites;
    private Role role;

    public User(String name, List<Movie> favorites, Role role) {
        this.uuid = UUID.randomUUID().toString();
        this.name = name;
        this.favorites = favorites;
        this.role = role;
    }

    public User() {
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

    public List<Movie> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Movie> favorites) {
        this.favorites = favorites;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(uuid, user.uuid) &&
                Objects.equals(name, user.name) &&
                Objects.equals(favorites, user.favorites) &&
                role == user.role;
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid, name, favorites, role);
    }

    @Override
    public String toString() {
        return "User{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", favorites=" + favorites +
                ", role=" + role +
                '}';
    }
}
