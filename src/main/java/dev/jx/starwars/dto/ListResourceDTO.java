package dev.jx.starwars.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
abstract public class ListResourceDTO<T> implements Serializable {

    protected boolean hasNext;
    protected boolean hasPrevious;
    protected List<T> data;
}
