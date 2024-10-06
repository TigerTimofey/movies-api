package com.movies.api.repository;

import com.movies.api.entities.Actor;
import io.micrometer.common.lang.NonNullApi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.lang.NonNull;

import java.util.Optional;

@NonNullApi

public interface ActorRepository extends JpaRepository<Actor, Long> {

    @NonNull
    @Override
    Optional<Actor> findById(@NonNull Long id); // Ensuring the method respects non-null expectations
}
