package dev.jx.starwars.dto;

import dev.jx.starwars.model.Film;
import lombok.Data;

import java.io.Serializable;
import java.net.URI;
import java.time.LocalDate;

@Data
public class FilmDTO implements Serializable {

    private int id;
    private String title;
    private int episodeId;
    private String summary;
    private String director;
    private String producer;
    private LocalDate releaseDate;

    public static FilmDTO fromModel(Film film) {
        FilmDTO filmDTO = new FilmDTO();
        filmDTO.setId(extractId(film));
        filmDTO.setTitle(film.getTitle());
        filmDTO.setEpisodeId(film.getEpisodeId());
        filmDTO.setDirector(film.getDirector());
        filmDTO.setProducer(film.getProducer());
        filmDTO.setReleaseDate(LocalDate.parse(film.getReleaseDate()));

        return filmDTO;
    }

    static int extractId(Film film) {
        final URI url = URI.create(film.getUrl());
        String path = url.getPath();
        String[] pathParts = path.split("/");
        String id = pathParts[pathParts.length - 1];

        return Integer.parseInt(id);
    }

    static int extractId(String url) {
        Film film = new Film();
        film.setUrl(url);

        return extractId(film);
    }
}
