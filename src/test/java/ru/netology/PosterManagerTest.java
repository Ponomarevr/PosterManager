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

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddOneFilm() {
        PosterManager manager = new PosterManager();

        manager.add("film1");

        String[] expected = {"film1"};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldHaveNothing() {
        PosterManager manager = new PosterManager();

        String[] expected = {};
        String[] actual = manager.findAll();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfLessThanLimit() {
        PosterManager manager = new PosterManager(7);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");

        String[] expected = {"film4", "film3", "film2", "film1"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfMoreThanDefault() {
        PosterManager manager = new PosterManager(11);

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");
        manager.add("film13");
        manager.add("film14");
        manager.add("film15");
        manager.add("film16");

        String[] expected = {"film16", "film15", "film14", "film13", "film12", "film11", "film10", "film9", "film8", "film7", "film6"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastDefaultLimit() {
        PosterManager manager = new PosterManager();

        manager.add("film1");
        manager.add("film2");
        manager.add("film3");
        manager.add("film4");
        manager.add("film5");
        manager.add("film6");
        manager.add("film7");
        manager.add("film8");
        manager.add("film9");
        manager.add("film10");
        manager.add("film11");
        manager.add("film12");
        manager.add("film13");
        manager.add("film14");
        manager.add("film15");
        manager.add("film16");

        String[] expected = {"film16", "film15", "film14", "film13", "film12", "film11", "film10", "film9", "film8", "film7"};
        String[] actual = manager.findLast();

        Assert.assertArrayEquals(expected, actual);
    }
}


