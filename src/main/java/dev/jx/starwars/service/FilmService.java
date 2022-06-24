package dev.jx.starwars.service;

import dev.jx.starwars.dto.FilmDTO;
import dev.jx.starwars.dto.FilmListDTO;

public interface FilmService {

    FilmListDTO getAll(int page);

    FilmDTO getFilmById(int id);

    FilmListDTO searchFilms(String search);
}
