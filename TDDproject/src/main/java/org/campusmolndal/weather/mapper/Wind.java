package org.campusmolndal.weather.mapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Wind {
    double speed;
    int deg;
    double gust;

    @JsonProperty("speed")
    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    @JsonProperty("deg")
    public int getDeg() {
        return this.deg;
    }

    public void setDeg(int deg) {
        this.deg = deg;
    }

    @JsonProperty("gust")
    public double getGust() {
        return this.gust;
    }

    public void setGust(double gust) {
        this.gust = gust;
    }
}
