package com.movies.api.controllers;

import com.movies.api.entities.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/movies")
public class MovieController {
    @GetMapping
    public List<Movie> getMovies() {
        List<Movie> movies = new java.util.ArrayList<>();
        movies.add(new Movie(
                1L,
                "Mr. and Mrs. Smith",
                2002,
                60
        ));
        return movies;
    }
}
