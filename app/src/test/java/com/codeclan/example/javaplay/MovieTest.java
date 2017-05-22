package com.codeclan.example.javaplay;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by home on 5/22/17.
 */
public class MovieTest {

    @Test
    public void hasTitle() {
        Movie movie = new Movie("The Lord of the Rings");
        assertEquals("The Lord of the Rings", movie.getTitle());
    }

}