package dev.jx.starwars.service;

import dev.jx.starwars.dto.FilmDTO;
import dev.jx.starwars.dto.PeopleDTO;
import dev.jx.starwars.dto.PeopleListDTO;
import dev.jx.starwars.model.People;
import dev.jx.starwars.model.PeopleList;
import dev.jx.starwars.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PeopleServiceImpl implements PeopleService {

    @Autowired
    @Qualifier("peopleRepositoryImpl")
    private PeopleRepository peopleRepository;

    @Autowired
    @Qualifier("filmServiceImpl")
    private FilmService filmService;

    @Override
    public PeopleListDTO getAll(int page) {
        PeopleList peopleList = peopleRepository.getAll(page);
        return PeopleListDTO.fromModel(peopleList);
    }

    @Override
    public PeopleDTO getPeopleById(int id) {
        People people = peopleRepository.getPeopleById(id);
        PeopleDTO peopleDTO = PeopleDTO.fromModel(people);
        peopleDTO.getFilms().forEach((filmDTO) -> {
            FilmDTO data = filmService.getFilmById(filmDTO.getId());
            filmDTO.setTitle(data.getTitle());
            filmDTO.setEpisodeId(data.getEpisodeId());
            filmDTO.setSummary(data.getSummary());
            filmDTO.setDirector(data.getDirector());
            filmDTO.setProducer(data.getProducer());
            filmDTO.setReleaseDate(data.getReleaseDate());
        });

        return peopleDTO;
    }

    @Override
    public PeopleListDTO searchPeople(String search) {
        PeopleList peopleList = peopleRepository.searchPeople(search);
        return PeopleListDTO.fromModel(peopleList);
    }
}
