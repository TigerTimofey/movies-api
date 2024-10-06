package com.movies.api.controllers;

import com.movies.api.entities.Actor;
import com.movies.api.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/actors")
public class ActorController {

    @Autowired
    private ActorService actorService;

    @GetMapping
    public List<Actor> getActors() {
        return actorService.getActorDetails(null); // Get all actors
    }

    @PostMapping("/save") // Removed the redundant "api" part
    public ResponseEntity<Actor> saveActor(@RequestBody Actor empObj) {
        actorService.saveActor(empObj);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = {"/getActors", "/{id}"}) // Adjusted the mapping
    public List<Actor> getActor(@PathVariable(required = false) Long id) {
        return actorService.getActorDetails(id);
    }

    @DeleteMapping("/delete/{id}") // Adjusted the mapping
    public ResponseEntity<Void> removeActor(@PathVariable Long id) {
        actorService.deleteActor(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
