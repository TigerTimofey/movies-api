package com.movies.api.service;

import com.movies.api.entities.Movie;
import java.util.ArrayList;
import java.util.List;

public class MovieService {
    // List of movies
    private final List<Movie> movies;

    // Singleton instance
    private static MovieService instance = null;

    public static MovieService getInstance() {
        if (instance == null) {
            instance = new MovieService();
        }
        return instance;
    }

    // Constructor initializing the list of movies
    public MovieService() {
        movies = new ArrayList<>();
        movies.add(new Movie(1L, "Avengers: Endgame", 2019, 181));
        movies.add(new Movie(2L, "Mr & Mrs Smith", 2005, 120));
        movies.add(new Movie(3L, "Black is King", 2020, 85));
        movies.add(new Movie(4L, "Reign", 2013, 42));
        movies.add(new Movie(5L, "Ebola Holmes", 2020, 123));
    }

    // Return all movies
    public List<Movie> fetchMovies() {
        return movies;
    }

    // Return movie by ID
    public Movie getMovieById(Long id) {
        for (Movie m : movies) {
            if (m.getId().equals(id)) {
                return m;
            }
        }
        return null; // Return null if not found
    }

    // Create a new movie
    public Movie createMovie(Long id, String title, Integer releaseYear, Integer duration) {
        Movie newMovie = new Movie(id, title, releaseYear, duration);
        movies.add(newMovie);
        return newMovie;
    }

    // Update an existing movie
    public Movie updateMovie(Long id, String title, Integer releaseYear, Integer duration) {
        for (Movie m : movies) {
            if (m.getId().equals(id)) {
                m.setTitle(title);
                m.setReleaseYear(releaseYear);
                m.setDuration(duration);
                return m; // Return updated movie
            }
        }
        return null; // Return null if not found
    }

    // Delete movie by ID
    public boolean deleteMovie(Long id) {
        return movies.removeIf(m -> m.getId().equals(id)); // Remove and return true if deleted
    }
}
