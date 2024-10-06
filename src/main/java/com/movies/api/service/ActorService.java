package com.movies.api.service;

import com.movies.api.entities.Actor;
import com.movies.api.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActorService {

    @Autowired
    private ActorRepository actorRepository;

    public void saveActor(Actor empObj) {
        actorRepository.save(empObj);
    }

    public List<Actor> getActorDetails(Long id) {
        if (id != null) {
            return actorRepository.findById(id)
                    .map(List::of) // Wrap the found actor in a list
                    .orElse(List.of()); // Return an empty list if not found
        } else {
            return actorRepository.findAll(); // Return all actors if no ID is provided
        }
    }

    public void deleteActor(Long id) {
        actorRepository.deleteById(id);
    }
}
