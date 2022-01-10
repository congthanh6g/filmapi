package com.example.filmapi.Repository;

import com.example.filmapi.Model.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<MovieEntity , Integer> {
}
