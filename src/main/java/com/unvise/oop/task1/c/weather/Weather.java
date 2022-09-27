package com.unvise.oop.task1.c.weather;

import com.unvise.oop.task1.c.weather.enums.Air;
import com.unvise.oop.task1.c.weather.enums.Humidity;
import com.unvise.oop.task1.c.weather.enums.Precipitation;
import com.unvise.oop.task1.c.weather.enums.Temperature;

public class Weather {
    private final Temperature temperature;
    private final Precipitation precipitation;
    private final Humidity humidity;
    private final Air air;

    public Weather(Temperature temperature, Precipitation precipitation, Humidity humidity, Air air) {
        this.temperature = temperature;
        this.precipitation = precipitation;
        this.humidity = humidity;
        this.air = air;
    }

    public Temperature getTemperature() {
        return temperature;
    }

    public Precipitation getPrecipitation() {
        return precipitation;
    }

    public Humidity getHumidity() {
        return humidity;
    }

    public Air getAir() {
        return air;
    }

}
