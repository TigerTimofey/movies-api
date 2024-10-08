package com.movies.api.entities;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter

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
