package dev.jx.starwars.dto;

import dev.jx.starwars.model.PeopleList;

import java.util.List;
import java.util.stream.Collectors;

public class PeopleListDTO extends ListResourceDTO<PeopleDTO> {

    public static PeopleListDTO fromModel(PeopleList peopleList) {
        PeopleListDTO peopleListDTO = new PeopleListDTO();
        List<PeopleDTO> data = peopleList.getResults().stream()
                .map(PeopleDTO::fromModel)
                .collect(Collectors.toList());
        peopleListDTO.setHasNext(peopleList.getNext() != null);
        peopleListDTO.setHasPrevious(peopleList.getPrevious() != null);
        peopleListDTO.setData(data);

        return peopleListDTO;
    }
}
