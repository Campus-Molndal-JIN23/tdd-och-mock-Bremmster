package org.campusmolndal.weather;

import org.json.JSONObject;

public class WeatherService {

    private WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public JSONObject getWeather(String city) {
        return null;
    }
}
