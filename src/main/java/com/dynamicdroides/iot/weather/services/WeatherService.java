package com.dynamicdroides.iot.weather.services;

import com.dynamicdroides.iot.weather.beans.Root;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Autowired
    RestTemplate restTemplate;

    private String weatherUrl="https://api.openweathermap.org/data/2.5/weather";
    public Root getWeather(Double lat, Double lon, String appId){
        //
        ResponseEntity<Root> response
                = restTemplate.getForEntity(weatherUrl + "?lat="+lat+"&lon="+lon+"&appid="+appId, Root.class);

        return response.getBody();
    }
}
