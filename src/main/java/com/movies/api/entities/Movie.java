package com.movies.api.entities;
import lombok.Getter;
import lombok.Setter;



@Getter
@Setter
public class Movie {
    private final Long id;
    private String title;
    private Integer releaseYear;
    private Integer duration;

    // Constructor
    public Movie(Long id, String title, Integer releaseYear, Integer duration) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
        this.duration = duration;
    }


    // To String
    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                ", duration=" + duration +
                '}';
    }
}
