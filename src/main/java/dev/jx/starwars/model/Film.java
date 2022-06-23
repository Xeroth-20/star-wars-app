package dev.jx.starwars.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class Film implements Serializable {

    private String title;
    private Integer episode_id;
    private String opening_crawl;
    private String director;
    private String producer;
    private String release_date;
    private List<String> species;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> characters;
    private List<String> planets;
    private String url;
    private String created;
    private String edited;
}
