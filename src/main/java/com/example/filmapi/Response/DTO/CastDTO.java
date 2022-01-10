package com.example.filmapi.Response.DTO;


import com.example.filmapi.Model.MovieEntity;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.ManyToMany;
import java.util.Date;
import java.util.Set;

public class CastDTO {

    private int id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date create_at;
    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date update_at;

    private String image;
    private String description;

    @ManyToMany(mappedBy = "casts")
    @JsonBackReference
    private Set<MovieEntity> likemovies;

    public CastDTO() {
    }

    public CastDTO(int id, String name, Date create_at, Date update_at, String image, String description, Set<MovieEntity> likemovies) {
        this.id = id;
        this.name = name;
        this.create_at = create_at;
        this.update_at = update_at;
        this.image = image;
        this.description = description;
        this.likemovies = likemovies;
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

    public Set<MovieEntity> getLikemovies() {
        return likemovies;
    }

    public void setLikemovies(Set<MovieEntity> likemovies) {
        this.likemovies = likemovies;
    }
}
