package dev.jx.starwars.repository;

import dev.jx.starwars.model.Film;
import dev.jx.starwars.model.FilmList;

public interface FilmRepository {

    FilmList getAll(int page);

    Film getFilmById(int id);

    FilmList searchFilms(String search);
}
