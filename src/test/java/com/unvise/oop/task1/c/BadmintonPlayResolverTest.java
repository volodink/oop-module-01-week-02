package com.unvise.oop.task1.c;

import com.unvise.oop.task1.c.weather.Weather;
import com.unvise.oop.task1.c.weather.enums.Air;
import com.unvise.oop.task1.c.weather.enums.Humidity;
import com.unvise.oop.task1.c.weather.enums.Precipitation;
import com.unvise.oop.task1.c.weather.enums.Temperature;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BadmintonPlayResolverTest {

    @Test
    void resolve() {
        // given
        Weather playableWeather = new Weather(Temperature.HOT, Precipitation.CLEAR, Humidity.LOW, Air.NO);
        Weather unplayableWeather = new Weather(Temperature.CHILLY, Precipitation.CLEAR, Humidity.HIGH, Air.NO);
        // then
        assertAll(
                () -> assertTrue(BadmintonPlayResolver.resolve(playableWeather)),
                () -> assertFalse(BadmintonPlayResolver.resolve(unplayableWeather))
        );
    }
}