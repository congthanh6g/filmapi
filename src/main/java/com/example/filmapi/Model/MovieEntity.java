package com.example.filmapi.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "movies")
public class MovieEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    @JsonIgnoreProperties(value = {"listMovies" , "handler" , "hibernateLazyInitializer"} , allowSetters = true)
    @JoinColumn(name = "categoryid", insertable = false , updatable = false)
    private CategoryEntity category;

    @ManyToOne()
    @JsonIgnoreProperties(value = {"Movies" , "handler" , "hibernateLazyInitializer"} , allowSetters = true)
    @JoinColumn(name = "directorid" ,  insertable = false , updatable = false)
    private DirectorEntity director;

    @ManyToMany()
    @JoinTable(name = "movie_cast" , joinColumns = @JoinColumn(name = "movie_id") , inverseJoinColumns = @JoinColumn(name = "cast_id"))
    @JsonManagedReference
    private Set<CastEntity> casts;


    public MovieEntity() {
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
