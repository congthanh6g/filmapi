package com.example.filmapi.Response.DTO;

import com.example.filmapi.Model.CastEntity;
import com.example.filmapi.Model.CategoryEntity;
import com.example.filmapi.Model.DirectorEntity;
import com.fasterxml.jackson.annotation.*;

import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.Date;
import java.util.Set;

public class MovieDTO {
    private int id;

    private String name;

    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date create_at;
    @JsonFormat(pattern = "yyyy-MM-dd" , shape = JsonFormat.Shape.STRING)
    private Date update_at;

    private String thumbnail;
    private int categoryid;
    private int directorid;
    private String description;
    private int duration;
    private int view;
    private String url;

    @ManyToOne()
    @JoinColumn(name = "categoryid", insertable = false , updatable = false)
    @JsonIgnoreProperties(value = {"listMovies" , "handler" , "hibernateLazyInitializer"} , allowSetters = true)
    private CategoryEntity category;

    @ManyToOne()
    @JoinColumn(name = "directorid" ,  insertable = false , updatable = false)
    @JsonIgnoreProperties(value = {"Movies" , "handler" , "hibernateLazyInitializer"} , allowSetters = true)
    private DirectorEntity director;

    @ManyToMany()
    @JoinTable(name = "movie_cast" , joinColumns = @JoinColumn(name = "movie_id") , inverseJoinColumns = @JoinColumn(name = "cast_id"))
    @JsonManagedReference
    private Set<CastEntity> casts;


    public MovieDTO() {
    }

    public MovieDTO(int id, String name, Date create_at, Date update_at, String thumbnail, int categoryid, int directorid, String description, int duration, int view, String url, CategoryEntity category, DirectorEntity director, Set<CastEntity> casts) {
        this.id = id;
        this.name = name;
        this.create_at = create_at;
        this.update_at = update_at;
        this.thumbnail = thumbnail;
        this.categoryid = categoryid;
        this.directorid = directorid;
        this.description = description;
        this.duration = duration;
        this.view = view;
        this.url = url;
        this.category = category;
        this.director = director;
        this.casts = casts;
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

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getCategoryid() {
        return categoryid;
    }

    public void setCategoryid(int categoryid) {
        this.categoryid = categoryid;
    }

    public int getDirectorid() {
        return directorid;
    }

    public void setDirectorid(int directorid) {
        this.directorid = directorid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public DirectorEntity getDirector() {
        return director;
    }

    public void setDirector(DirectorEntity director) {
        this.director = director;
    }

    public Set<CastEntity> getCasts() {
        return casts;
    }

    public void setCasts(Set<CastEntity> casts) {
        this.casts = casts;
    }
}
