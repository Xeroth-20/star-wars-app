package dev.jx.starwars.controller;

import dev.jx.starwars.dto.PeopleListDTO;
import dev.jx.starwars.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/people")
public class PeopleController {

    @Autowired
    @Qualifier("peopleServiceImpl")
    private PeopleService peopleService;

    @GetMapping
    public String getPeople(@RequestParam(required = false, defaultValue = "1") int page, Model model) {
        PeopleListDTO peopleListDTO = peopleService.getAll(page);
        model.addAttribute("people", peopleListDTO.getData());
        model.addAttribute("nextPage", peopleListDTO.isHasNext() ? page + 1 : null);
        model.addAttribute("previousPage", peopleListDTO.isHasPrevious() ? page - 1 : null);

        return "/people/index";
    }

    @GetMapping("{id}")
    public String getPerson(@PathVariable int id, Model model) {
        model.addAttribute("person", peopleService.getPeopleById(id));
        return "/people/detalle";
    }
}
