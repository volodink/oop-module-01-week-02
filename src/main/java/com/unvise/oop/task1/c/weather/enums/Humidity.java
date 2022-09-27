package com.unvise.oop.task1.c.weather.enums;

public enum Humidity {
    HIGH("высокая"),
    LOW("низкая");

    public static final String[] NAMES = new String[Humidity.values().length];

    static {
        Humidity[] humidity = Humidity.values();
        for (int i = 0; i < humidity.length; i++)
            NAMES[i] = humidity[i].getName();
    }

    private final String name;

    Humidity(String name) {
        this.name = name;
    }

    public static Humidity valueOfName(String name) {
        for (Humidity humidity : Humidity.values())
            if (humidity.getName().equals(name.trim()))
                return humidity;
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
}
