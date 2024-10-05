package com.movies.api;

import com.movies.api.entities.Actor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
@RestController
public class ApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiApplication.class, args);
	}

	@GetMapping
	public List<Actor> actors() {
        List<Actor> actors = new java.util.ArrayList<>();
        actors.add(new Actor(
                1L,
                "Brad Pitt",
                Instant.parse("1963-12-18T00:00:00Z")
//						LocalDate.of(1890, Month.SEPTEMBER, 10)
        ));//						LocalDate.of(1890, Month.SEPTEMBER, 10)
        return actors;
	}

}
