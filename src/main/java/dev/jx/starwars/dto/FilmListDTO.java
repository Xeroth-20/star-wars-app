package dev.jx.starwars.dto;

import dev.jx.starwars.model.FilmList;

import java.util.List;
import java.util.stream.Collectors;

public class FilmListDTO extends ListResourceDTO<FilmDTO> {

    public static FilmListDTO fromModel(FilmList filmList) {
        FilmListDTO filmListDTO = new FilmListDTO();
        List<FilmDTO> data = filmList.getResults().stream()
                .map(FilmDTO::fromModel)
                .collect(Collectors.toList());
        filmListDTO.setHasNext(filmList.getNext() != null);
        filmListDTO.setHasPrevious(filmList.getPrevious() != null);
        filmListDTO.setData(data);

        return filmListDTO;
    }
}
