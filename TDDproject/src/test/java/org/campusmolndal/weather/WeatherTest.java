package org.campusmolndal.weather;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.json.JSONArray;
import org.json.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class WeatherTest {

    WeatherAPI weatherAPIMock;
    @BeforeEach
    void setUp() {
        weatherAPIMock = mock(WeatherAPI.class);

        JSONObject mockResponse = new JSONObject();

        // Coordinates
        JSONObject coordObject = new JSONObject();
        coordObject.put("lon", 11.97);
        coordObject.put("lat", 57.71);
        mockResponse.put("coord", coordObject);
        // weather
        JSONArray weatherArray = new JSONArray();
        JSONObject weatherObject = new JSONObject();
        weatherObject.put("id", 804);
        weatherObject.put("main", "Clouds");
        weatherObject.put("description", "overcast clouds");
        weatherObject.put("icon", "04d");
        weatherArray.put(weatherObject);
        mockResponse.put("weather", weatherArray);
        // base
        mockResponse.put("base", "stations");
        // main
        JSONObject mainObject = new JSONObject();
        mainObject.put("temp", 20.59);
        mainObject.put("feels_like", 20.13);
        mainObject.put("temp_min", 18.89);
        mainObject.put("temp_max", 21.74);
        mainObject.put("pressure", 1013);
        mainObject.put("humidity", 67);
        mockResponse.put("main", mainObject);
        // visibility
        mockResponse.put("visibility", 10000);
        // wind
        JSONObject windObject = new JSONObject();
        windObject.put("speed", 5.14);
        windObject.put("deg", 210);
        windObject.put("gust", 7.2);
        mockResponse.put("wind", windObject);
        // clouds
        JSONObject cloudsObject = new JSONObject();
        cloudsObject.put("all", 90);
        mockResponse.put("clouds", cloudsObject);
        // dt
        mockResponse.put("dt", 1599478913);
        // sys
        JSONObject sysObject = new JSONObject();
        sysObject.put("type", 1);
        sysObject.put("id", 1752);
        sysObject.put("country", "SE");
        sysObject.put("sunrise", 1599457990);
        sysObject.put("sunset", 1599510755);
        mockResponse.put("sys", sysObject);
        // timezone
        mockResponse.put("timezone", 7200);
        // id
        mockResponse.put("id", 2711537);
        // name
        mockResponse.put("name", "Gothenburg");
        // cod
        mockResponse.put("cod", 200);

        when(weatherAPIMock.getWeather()).thenReturn(mockResponse);
    }


    @Test
    void getWeather() throws JsonProcessingException {
        WeatherService sut = new WeatherService(weatherAPIMock);
        System.out.println(sut.getWeather().getName());

    }
}