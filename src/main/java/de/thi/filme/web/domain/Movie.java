package de.thi.filme.web.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 26.10.2015.
 * data model for Movie.
 */
public class Movie implements Serializable {

    private String name;
    private boolean format;
    private String genre;
    private String director;
    private String description;
    private List<String> actors = new ArrayList<>();

    public Movie() {
    }

    public Movie(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setActors(List<String> actors) {
        this.actors = actors;
    }


    public void setFormat(boolean format) {
        this.format = format;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getIngredients() {
        return actors;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public String getDirector() {
        return director;
    }

    public boolean isFormat() {
        return format;
    }

    public void addIngredient(String actor) {
        actors.add(actor);
    }
}