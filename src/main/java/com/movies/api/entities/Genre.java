package com.movies.api.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Genre {
    // Getter for id (no setter)
    private final
    Long id;
    private String name;

    // Constructor
    public Genre(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // To String
    @Override
    public String toString() {
        return "Genre{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
