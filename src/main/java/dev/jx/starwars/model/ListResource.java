package dev.jx.starwars.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
abstract public class ListResource<T> implements Serializable {

    protected int count;
    protected String next;
    protected String previous;
    protected List<T> results;
}
