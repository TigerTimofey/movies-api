package com.movies.api.controller;

import com.movies.api.entities.Actor;
import com.movies.api.service.ActorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/actors")
public class ActorController {

    private final ActorService actorService;

    public ActorController() {
        this.actorService = ActorService.getInstance(); // Use singleton instance
    }

    // GET all movies
    @GetMapping
    public List<Actor> getAllActors() {
        return actorService.fetchActors();
    }

    // GET movie by ID
    @GetMapping("/{id}")
    public Actor getActorById(@PathVariable Long id) {
        return actorService.getActorById(id);
    }

    // POST a new movie
    @PostMapping
    public Actor createActor(@RequestBody Actor actor) {
        return actorService.createActor(actor.getId(), actor.getName(), actor.getBirthDate());
    }

    // PUT update a actor
    @PutMapping("/{id}")
    public Actor updateActor(@PathVariable Long id, @RequestBody Actor actor) {
        return actorService.createActor(actor.getId(), actor.getName(), actor.getBirthDate());
    }

    // DELETE a movie
    @DeleteMapping("/{id}")
    public boolean deleteActor(@PathVariable Long id) {
        return actorService.deleteActor(id);
    }
}

