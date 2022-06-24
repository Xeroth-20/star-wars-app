package dev.jx.starwars.repository;

import java.net.URI;

import dev.jx.starwars.model.People;
import dev.jx.starwars.model.PeopleList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import dev.jx.starwars.util.Env;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Repository
@Slf4j
public class PeopleRepositoryImpl implements PeopleRepository {

    @Autowired
    private Env env;

    @Autowired
    private RestTemplate restClient;

    @Override
    public PeopleList getAll(int page) {
        final URI url = URI.create(env.getStarWarsApiUrl() + "/people/?page=" + page);
        try {
            ResponseEntity<PeopleList> res = restClient.getForEntity(url, PeopleList.class);
            if (res.hasBody()) {
                PeopleList data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while getting all people", ex);
        }

        return null;
    }

    @Override
    public People getPeopleById(int id) {
        final URI uri = URI.create(env.getStarWarsApiUrl() + "/people/" + id);
        try {
            ResponseEntity<People> res = restClient.getForEntity(uri, People.class);
            if (res.hasBody()) {
                People data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while getting people", ex);
        }

        return null;
    }

    @Override
    public PeopleList searchPeople(String search) {
        final URI url = URI.create(env.getStarWarsApiUrl() + "/people/?search=" + search);
        try {
            ResponseEntity<PeopleList> res = restClient.getForEntity(url, PeopleList.class);
            if (res.hasBody()) {
                PeopleList data = res.getBody();
                log.info("Response: {}", data);

                return data;
            }
        } catch (RestClientException ex) {
            log.error("Error while searching people", ex);
        }

        return null;
    }
}
