package ru.netology;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test

    public void shouldAddFourFilms() {
        PosterManager manager = new PosterManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");

        String[] expected = {"film1", "film2", "film3", "film4"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    public void shouldAddOneFilm() {
        PosterManager manager = new PosterManager();

        manager.add("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    public void shouldHaveNothing() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected,actual);


    }

    @Test
    public void shouldFindLast(){
        PosterManager manager = new PosterManager(2);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");

        String[] expected = {"film4", "film3"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected,actual);

    }

}
