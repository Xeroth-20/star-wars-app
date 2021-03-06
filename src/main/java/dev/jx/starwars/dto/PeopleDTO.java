package dev.jx.starwars.dto;

import dev.jx.starwars.model.People;
import lombok.Data;

import java.io.Serializable;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@Data
public class PeopleDTO implements Serializable {

    private int id;
    private String name;
    private List<FilmDTO> films;
    private String gender;
    private String height;
    private String birthYear;

    public static PeopleDTO fromModel(People people) {
        PeopleDTO peopleDTO = new PeopleDTO();
        peopleDTO.setId(extractId(people));
        peopleDTO.setName(people.getName());
        peopleDTO.setGender(people.getGender());
        peopleDTO.setHeight(people.getHeight());
        peopleDTO.setBirthYear(people.getBirthYear());

        List<FilmDTO> films = people.getFilms().stream().map((filmUrl) -> {
            FilmDTO filmDTO = new FilmDTO();
            filmDTO.setId(FilmDTO.extractId(filmUrl));

            return filmDTO;
        }).collect(Collectors.toList());

        peopleDTO.setFilms(films);

        return peopleDTO;
    }

    static int extractId(People people) {
        final URI url = URI.create(people.getUrl());
        String path = url.getPath();
        String[] pathParts = path.split("/");
        String id = pathParts[pathParts.length - 1];

        return Integer.parseInt(id);
    }
}
