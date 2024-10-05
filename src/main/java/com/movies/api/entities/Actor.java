package com.movies.api.entities;

import java.time.Instant;

public class Actor {

    private final Long id;
    private String name;
    private Instant birthDate;

    // Constructor
    public Actor(Long id, String name, Instant birthDate) {
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getter for id (no setter)
    public Long getId() {
        return id;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Instant getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Instant birthDate) {
        this.birthDate = birthDate;
    }

    // to String

    @Override
    public String toString() {
        return "Actor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
