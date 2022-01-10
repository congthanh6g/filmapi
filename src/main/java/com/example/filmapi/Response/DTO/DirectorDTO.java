package com.example.filmapi.Response.DTO;

import com.example.filmapi.Model.MovieEntity;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;


public class DirectorDTO {

    private int id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date create_at;
    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date update_at;

    private String image;
    private String description;

    @JsonIgnore
    @OneToMany(mappedBy = "director")
    private List<MovieEntity> Movies;



    public DirectorDTO() {
    }

    public DirectorDTO(int id, String name, Date create_at, Date update_at, String image, String description, List<MovieEntity> movies) {
        this.id = id;
        this.name = name;
        this.create_at = create_at;
        this.update_at = update_at;
        this.image = image;
        this.description = description;
        Movies = movies;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreate_at() {
        return create_at;
    }

    public void setCreate_at(Date create_at) {
        this.create_at = create_at;
    }

    public Date getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Date update_at) {
        this.update_at = update_at;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public List<MovieEntity> getMovies() {
        return Movies;
    }

    public void setMovies(List<MovieEntity> movies) {
        Movies = movies;
    }
}
