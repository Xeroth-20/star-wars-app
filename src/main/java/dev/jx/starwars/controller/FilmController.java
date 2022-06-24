package dev.jx.starwars.controller;

import dev.jx.starwars.dto.FilmListDTO;
import dev.jx.starwars.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/films")
public class FilmController {

    @Autowired
    @Qualifier("filmServiceImpl")
    private FilmService filmService;

    @GetMapping
    public String getFilms(@RequestParam(required = false, defaultValue = "1") int page, Model model) {
        FilmListDTO filmListDTO = filmService.getAll(page);
        model.addAttribute("films", filmListDTO.getData());
        model.addAttribute("nextPage", filmListDTO.isHasNext() ? page + 1 : null);
        model.addAttribute("previousPage", filmListDTO.isHasPrevious() ? page - 1 : null);

        return "/films/index";
    }

    @GetMapping("{id}")
    public String getFilm(@PathVariable int id, Model model) {
        model.addAttribute("film", filmService.getFilmById(id));
        return "/films/detalle";
    }
}
