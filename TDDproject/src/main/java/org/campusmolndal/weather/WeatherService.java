package org.campusmolndal.weather;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.campusmolndal.weather.mapper.Root;

import java.io.IOException;

public class WeatherService {

    private final WeatherAPI weatherAPI;

    public WeatherService(WeatherAPI weatherAPI) {
        this.weatherAPI = weatherAPI;
    }

    public Root getWeatherReport() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        String apiResponse = String.valueOf(weatherAPI.getWeather());
        Root weatherReport = mapper.readValue(apiResponse, Root.class);
        return weatherReport;
    }
}
