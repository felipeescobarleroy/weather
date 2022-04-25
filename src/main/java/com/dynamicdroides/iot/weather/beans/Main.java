package com.dynamicdroides.iot.weather.beans;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Main {
    public double temp;
    public double feels_like;
    public double temp_min;
    public double temp_max;
    public int pressure;
    public int humidity;
    public int sea_level;
    //public int grnd_level;
    @JsonProperty("grnd_level")
    public int groundLevel;
}
