package com.movies.api.controller;


import com.movies.api.entities.Movie;
import com.movies.api.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController() {
        this.movieService = MovieService.getInstance(); // Use singleton instance
    }

    // GET all movies
    @GetMapping
    public List<Movie> getAllMovies() {
        return movieService.fetchMovies();
    }

    // GET movie by ID
    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Long id) {
        return movieService.getMovieById(id);
    }

    // POST a new movie
    @PostMapping
    public Movie createMovie(@RequestBody Movie movie) {
        return movieService.createMovie(movie.getId(), movie.getTitle(), movie.getReleaseYear(), movie.getDuration());
    }

    // PUT update a movie
    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return movieService.updateMovie(id, movie.getTitle(), movie.getReleaseYear(), movie.getDuration());
    }

    // DELETE a movie
    @DeleteMapping("/{id}")
    public boolean deleteMovie(@PathVariable Long id) {
        return movieService.deleteMovie(id);
    }
}

