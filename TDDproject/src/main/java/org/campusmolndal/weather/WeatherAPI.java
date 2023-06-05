package org.campusmolndal.weather;

import org.json.JSONObject;

public class WeatherAPI {

    private double lon;
    private double lat;

    public WeatherAPI(double lon, double lat) {
        this.lon = lon;
        this.lat = lat;
    }
    public JSONObject getWeather() {
        return new JSONObject();
    }
}
