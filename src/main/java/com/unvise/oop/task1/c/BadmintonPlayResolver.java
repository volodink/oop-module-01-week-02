package com.unvise.oop.task1.c;

import com.unvise.oop.task1.c.weather.Weather;
import com.unvise.oop.task1.c.weather.enums.Air;
import com.unvise.oop.task1.c.weather.enums.Humidity;

public class BadmintonPlayResolver {
    public static boolean resolve(Weather weather) {
        boolean isTemperatureOk = switch (weather.getTemperature()) {
            case HOT, WARM -> true;
            default -> false;
        };
        boolean isPrecipitationOk = switch (weather.getPrecipitation()) {
            case CLEAR, CLOUDY -> true;
            default -> false;
        };
        boolean isHumidityOK = weather.getHumidity().equals(Humidity.LOW);
        boolean isAir = weather.getAir().equals(Air.NO);

        return isTemperatureOk
                && isPrecipitationOk
                && isHumidityOK
                && isAir;
    }
}
