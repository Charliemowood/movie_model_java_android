package com.codeclan.example.javaplay;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/22/17.
 */
public class MovieTest {

    @Test
    public void canGetTitle() {
        Movie movie = new Movie("The Lord of the Rings", "History", 2);
        assertEquals("The Lord of the Rings", movie.getTitle());
    }

    @Test
    public void canSetTitle() {
        Movie movie = new Movie("The Cat in the Hat.", "Comedy", 5);
        movie.setTitle("Catz");
        assertEquals("Catz", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        Movie movie = new Movie("Kungfu Pandas", "Cheese", 10);
        assertEquals("Cheese", movie.getGenre());
    }

    @Test
    public void canSetGenre() {
        Movie movie = new Movie("Kungfu Pandas", "Cheese", 10);
        movie.setGenre("Adventure");
        assertEquals("Adventure", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        Movie movie = new Movie("Kungfu Pandas", "Cheese", 10);
        assertEquals(10, movie.getRanking());
    }

    @Test
    public void canSetRanking() {
        Movie movie = new Movie("Kungfu Pandas", "Cheese", 10);
        movie.setRanking(9);
        assertEquals(9, movie.getRanking());
    }

    @Test
    public void canOverrideString() {
        Movie movie = new Movie("Kungfu Pandas", "Cheese", 10);
        assertEquals("Title: Kungfu Pandas, Genre: Cheese, Ranking: 10", movie.toString());
    }

}