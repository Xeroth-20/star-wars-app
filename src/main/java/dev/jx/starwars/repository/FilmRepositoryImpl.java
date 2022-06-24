package dev.jx.starwars.repository;

import dev.jx.starwars.model.Film;
import dev.jx.starwars.model.FilmList;
import dev.jx.starwars.util.Env;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@Repository
@Slf4j
public class FilmRepositoryImpl implements FilmRepository {

    @Autowired
    private Env env;

    @Autowired
    private RestTemplate restClient;

    @Override
    public FilmList getAll(int page) {
        final URI url = URI.create(env.getStarWarsApiUrl() + "/films/?page=" + page);
        try {
            ResponseEntity<FilmList> res = restClient.getForEntity(url, FilmList.class);
            if (res.hasBody()) {
                FilmList data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while getting all films", ex);
        }

        return null;
    }

    @Override
    public Film getFilmById(int id) {
        final URI uri = URI.create(env.getStarWarsApiUrl() + "/films/" + id);
        try {
            ResponseEntity<Film> res = restClient.getForEntity(uri, Film.class);
            if (res.hasBody()) {
                Film data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while getting film", ex);
        }

        return null;
    }

    @Override
    public FilmList searchFilms(String search) {
        final URI url = URI.create(env.getStarWarsApiUrl() + "/films/?search=" + search);
        try {
            ResponseEntity<FilmList> res = restClient.getForEntity(url, FilmList.class);
            if (res.hasBody()) {
                FilmList data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while searching film", ex);
        }
        return null;
    }
}
