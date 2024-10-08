package com.movies.api.service;

import com.movies.api.entities.Actor;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ActorService {
    // List of actors
    private final List<Actor> actors;

    // Singleton instance
    private static ActorService instance = null;

    public static ActorService getInstance() {
        if (instance == null) {
            instance = new ActorService();
        }
        return instance;
    }

    // Constructor initializing the list of actors
    public ActorService() {
        actors = new ArrayList<>();
        actors.add(new Actor(1L, "Robert Downey Jr.", Instant.parse("1965-04-04T00:00:00Z")));
        actors.add(new Actor(2L, "Chris Evans", Instant.parse("1981-06-13T00:00:00Z")));
        actors.add(new Actor(3L, "Scarlett Johansson", Instant.parse("1984-11-22T00:00:00Z")));
        actors.add(new Actor(4L, "Chris Hemsworth", Instant.parse("1983-08-11T00:00:00Z")));
        actors.add(new Actor(5L, "Tom Holland", Instant.parse("1996-06-01T00:00:00Z")));
        actors.add(new Actor(6L, "Gal Gadot", Instant.parse("1985-04-30T00:00:00Z")));
        actors.add(new Actor(7L, "Ryan Reynolds", Instant.parse("1976-10-23T00:00:00Z")));
        actors.add(new Actor(8L, "Leonardo DiCaprio", Instant.parse("1974-11-11T00:00:00Z")));
        actors.add(new Actor(9L, "Emma Watson", Instant.parse("1990-04-15T00:00:00Z")));
        actors.add(new Actor(10L, "Jennifer Lawrence", Instant.parse("1990-08-15T00:00:00Z")));
        actors.add(new Actor(11L, "Brad Pitt", Instant.parse("1963-12-18T00:00:00Z")));
        actors.add(new Actor(12L, "Natalie Portman", Instant.parse("1981-06-09T00:00:00Z")));
        actors.add(new Actor(13L, "Christian Bale", Instant.parse("1974-01-30T00:00:00Z")));
        actors.add(new Actor(14L, "Dwayne Johnson", Instant.parse("1972-05-02T00:00:00Z")));
        actors.add(new Actor(15L, "Margot Robbie", Instant.parse("1990-07-02T00:00:00Z")));
    }

    // Return all actors
    public List<Actor> fetchActors() {
        return actors;
    }

    // Return movie by ID
    public Actor getActorById(Long id) {
        for (Actor a : actors) {
            if (a.getId().equals(id)) {
                return a;
            }
        }
        return null; // Return null if not found
    }

    // Create a new movie
    public Actor createActor(Long id, String name, Instant birthDate) {
        Actor newActor = new Actor(id, name, birthDate);
        actors.add(newActor);
        return newActor;
    }

    // Update an existing movie
    public Actor updateActor(Long id, String name, Instant birthDate) {
        for (Actor a : actors) {
            if (a.getId().equals(id)) {
                a.setName(name);
                a.setBirthDate(birthDate);
                return a; // Return updated actor
            }
        }
        return null; // Return null if not found
    }
    // Delete movie by ID
    public boolean deleteActor(Long id) {
        return actors.removeIf(a -> a.getId().equals(id)); // Remove and return true if deleted
    }
}
