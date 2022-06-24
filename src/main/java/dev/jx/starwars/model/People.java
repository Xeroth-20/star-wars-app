package dev.jx.starwars.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class People implements Serializable {

    private String name;
    private String height;
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    private String url;
    private List<String> films;
    private List<String> vehicles;
    private List<String> starships;
    private List<String> species;
    private String created;
    private String edited;
    @JsonProperty("birth_year")
    private String birthYear;
    @JsonProperty("eye_color")
    private String eyeColor;
    private String gender;
    private String homeworld;
}
