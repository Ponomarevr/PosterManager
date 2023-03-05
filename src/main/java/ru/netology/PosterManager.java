package ru.netology;

public class PosterManager {
    private String[] films = new String[0];
    private int limit;

    public PosterManager() {
        this.limit = 10;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;

    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int lastLength;
        if (films.length < limit) {
            lastLength = films.length;
        } else lastLength = limit;

        String[] last = new String[lastLength];
        for (int i = 0; i < lastLength; i++) {
            last[i] = films[films.length - 1 - i];
        }
        return last;
    }
}
