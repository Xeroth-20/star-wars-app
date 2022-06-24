package dev.jx.starwars.service;

import dev.jx.starwars.dto.FilmDTO;
import dev.jx.starwars.dto.FilmListDTO;
import dev.jx.starwars.model.Film;
import dev.jx.starwars.model.FilmList;
import dev.jx.starwars.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    @Qualifier("filmRepositoryImpl")
    private FilmRepository filmRepository;

    @Override
    public FilmListDTO getAll(int page) {
        FilmList filmList = filmRepository.getAll(page);
        return FilmListDTO.fromModel(filmList);
    }

    @Override
    public FilmDTO getFilmById(int id) {
        Film film = filmRepository.getFilmById(id);
        return FilmDTO.fromModel(film);
    }

    @Override
    public FilmListDTO searchFilms(String search) {
        FilmList filmList = filmRepository.searchFilms(search);
        return FilmListDTO.fromModel(filmList);
    }
}
