package com.unvise.oop.task1.c;

import com.unvise.oop.task1.c.weather.Weather;
import com.unvise.oop.task1.c.weather.enums.Air;
import com.unvise.oop.task1.c.weather.enums.Humidity;
import com.unvise.oop.task1.c.weather.enums.Precipitation;
import com.unvise.oop.task1.c.weather.enums.Temperature;

import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner stringScanner = new Scanner(System.in)) {
            System.out.printf("Введите температуру %s: ", Arrays.toString(Temperature.NAMES));
            Temperature temperature = Temperature.valueOfName(stringScanner.next());
            System.out.printf("Введите осадки %s: ", Arrays.toString(Precipitation.NAMES));
            Precipitation precipitation = Precipitation.valueOfName(stringScanner.next());
            System.out.printf("Введите влажность %s: ", Arrays.toString(Humidity.NAMES));
            Humidity humidity = Humidity.valueOfName(stringScanner.next());
            System.out.printf("Введите ветер %s: ", Arrays.toString(Air.NAMES));
            Air air = Air.valueOfName(stringScanner.next());

            Weather weather = new Weather(temperature, precipitation, humidity, air);
            String decision = BadmintonPlayResolver.resolve(weather) ? "Да" : "Нет";
            System.out.println("Решение: " + decision);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректные данные");
            System.exit(1);
        }
    }
}
