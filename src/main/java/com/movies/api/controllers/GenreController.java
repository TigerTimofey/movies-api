package com.movies.api.controllers;


import com.movies.api.entities.Genre;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/genres")
public class GenreController {
    @GetMapping
    public List<Genre> getGenres() {
        List<Genre> genres = new java.util.ArrayList<>();
        genres.add(new Genre(
                1L,
                "Action"
        ));
        return genres;
    }
};
