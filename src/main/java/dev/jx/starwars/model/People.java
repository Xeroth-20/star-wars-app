package dev.jx.starwars.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class People implements Serializable {

    private String name;
    private String height;
    private String mass;
    private String hair_color;
    private String skin_color;
    private String url;
    private List<String> films;
    private List<String> vehicles;
    private List<String> starships;
    private List<String> species;
    private String created;
    private String edited;
    private String birth_year;
    private String eye_color;
    private String gender;
    private String homeworld;
}
