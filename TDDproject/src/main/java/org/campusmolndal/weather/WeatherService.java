package org.campusmolndal.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.campusmolndal.weather.mapper.Root;
import org.json.JSONObject;

public class WeatherService {

    private WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public void getWeather() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String apiResponse = String.valueOf(weatherAPI.getWeather());
        Root weatherReport = mapper.readValue(apiResponse, Root.class);
        System.out.println(weatherReport);
    }
}
