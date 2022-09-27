package com.unvise.oop.task1.c.weather.enums;

public enum Air {
    YES("есть"),
    NO("нет");

    public static final String[] NAMES = new String[Air.values().length];

    static {
        Air[] airs = Air.values();
        for (int i = 0; i < airs.length; i++)
            NAMES[i] = airs[i].getName();
    }

    private final String name;

    Air(String name) {
        this.name = name;
    }

    public static Air valueOfName(String name) {
        for (Air air : Air.values())
            if (air.getName().equals(name.trim()))
                return air;
        throw new IllegalArgumentException();
    }

    public String getName() {
        return name;
    }
}
