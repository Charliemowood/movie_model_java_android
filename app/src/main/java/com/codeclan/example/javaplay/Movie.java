package com.codeclan.example.javaplay;

/**
 * Created by home on 5/22/17.
 */

public class Movie {
    private String title;
    private String genre;
    private int ranking;


    public Movie(String title, String genre, int ranking) {
        this.title = title;
        this.genre = genre;
        this.ranking = ranking;
    }

    public Movie(String title) {
        this.title = title;
    }




    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Genre: " + genre + ", Ranking: " + ranking;
    }
}
