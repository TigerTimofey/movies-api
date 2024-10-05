package com.movies.api.entities;

public class Genre {
    private final
    Long id;
    private String name;

    // Constructor
    public Genre(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter for id (no setter)
    public Long getId() {
        return id;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
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
