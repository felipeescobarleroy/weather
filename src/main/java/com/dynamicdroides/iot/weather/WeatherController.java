package com.dynamicdroides.iot.weather;

import com.dynamicdroides.iot.weather.beans.Root;
import com.dynamicdroides.iot.weather.services.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

    @Autowired
    WeatherService weatherService;

    String apiId="e7716716d33aab14521b9ba307b2bc5d";
    @GetMapping
    public Root getWeather(@RequestParam(value = "lat", required = true) Double lat,@RequestParam(value = "lon", required = true) Double lon){
        //Llamar a https://api.openweathermap.org/data/2.5/weather
        //con los parametros lat y lon, agregar apiId
        //ejemplo: https://api.openweathermap.org/data/2.5/weather?lat=40&lon=3.6&appid=e7716716d33aab14521b9ba307b2bc5d
        //recoger llamada en estructura JSON Root
        return weatherService.getWeather(lat,lon,apiId);

    }



}
