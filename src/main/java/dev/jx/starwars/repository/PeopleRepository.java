package dev.jx.starwars.repository;

import dev.jx.starwars.model.People;
import dev.jx.starwars.model.PeopleList;

public interface PeopleRepository {

    PeopleList getAll(int page);

    People getPeopleById(int id);

    PeopleList searchPeople(String search);
}
