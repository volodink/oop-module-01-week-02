package com.unvise.oop.task1.c.weather.enums;

public enum Temperature {
    HOT("жарко"),
    WARM("тепло"),
    CHILLY("холодно");

    public static final String[] NAMES = new String[Temperature.values().length];

    static {
        Temperature[] temperatures = Temperature.values();
        for (int i = 0; i < temperatures.length; i++)
            NAMES[i] = temperatures[i].getName();
    }

    private final String name;

    Temperature(String name) {
        this.name = name;
    }

    public static Temperature valueOfName(String name) throws IllegalArgumentException {
        for (Temperature temperature : Temperature.values())
            if (temperature.getName().equals(name.trim()))
                return temperature;
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
}
