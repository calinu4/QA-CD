package com.qa.cd.persistence;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cd {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String artist;
    private String genre;
    private String title;

    public Cd() {

    }

    public Cd(String artist, String genre, String title) {
        this.artist=artist;
        this.genre = genre;
        this.title = title;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}