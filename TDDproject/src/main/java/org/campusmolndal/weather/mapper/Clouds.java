package org.campusmolndal.weather.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clouds {
    int all;

    @JsonProperty("all")
    public int getAll() {
        return this.all;
    }

    public void setAll(int all) {
        this.all = all;
    }
}
