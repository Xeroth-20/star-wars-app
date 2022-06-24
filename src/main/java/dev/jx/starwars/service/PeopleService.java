package dev.jx.starwars.service;

import dev.jx.starwars.dto.PeopleDTO;
import dev.jx.starwars.dto.PeopleListDTO;

public interface PeopleService {

    PeopleListDTO getAll(int page);

    PeopleDTO getPeopleById(int id);

    PeopleListDTO searchPeople(String search);
}
