package com.example.filmapi.Model;

import javax.persistence.Table;

@Table(name = "movie_cast")
public class Movie_Cast {
    private int movie_id;
    private int cast_id;

    public Movie_Cast() {
    }

    public int getMovie_id() {
        return movie_id;
    }

    public void setMovie_id(int movie_id) {
        this.movie_id = movie_id;
    }

    public int getCast_id() {
        return cast_id;
    }

    public void setCast_id(int cast_id) {
        this.cast_id = cast_id;
    }
}
