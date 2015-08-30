package com.smartnews.rest.dto;

/**
 * Created by fein on 8/27/2015.
 */
public abstract class NamedDto {
    private final long id;
    private final String name;

    public NamedDto(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
