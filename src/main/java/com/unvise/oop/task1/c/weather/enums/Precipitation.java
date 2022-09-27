package com.unvise.oop.task1.c.weather.enums;

public enum Precipitation {
    CLEAR("ясно"),
    CLOUDY("облачно"),
    RAIN("дождь"),
    SNOW("снег"),
    HAIL("град"),
    ;

    public static final String[] NAMES = new String[Precipitation.values().length];

    static {
        Precipitation[] precipitations = Precipitation.values();
        for (int i = 0; i < precipitations.length; i++)
            NAMES[i] = precipitations[i].getName();
    }

    private final String name;

    Precipitation(String name) {
        this.name = name;
    }

    public static Precipitation valueOfName(String name) throws IllegalArgumentException {
        for (Precipitation precipitation : Precipitation.values())
            if (precipitation.getName().equals(name.trim()))
                return precipitation;
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
}
