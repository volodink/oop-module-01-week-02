package com.unvise.oop.task3.util;

import java.util.Objects;

import static java.util.Objects.nonNull;

public class CommandLineArgumentCaptor {
    private static final String ARRAY_ARGUMENT_NAME = "-arr";

    public static double[] numberArray(String[] namedArgument) throws RuntimeException {
        if (namedArgument.length > 2)
            throw new RuntimeException();
        if (!Objects.equals(namedArgument[0], ARRAY_ARGUMENT_NAME))
            throw new RuntimeException();

        if (nonNull(namedArgument[1])) {
            String arrayAsString = namedArgument[1];
            if (arrayAsString.startsWith("[") && arrayAsString.endsWith("]")) {
                String[] stringsArray = arrayAsString
                        .replace("[", "")
                        .replace("]", "")
                        .split(",");
                double[] numbers = new double[stringsArray.length];
                for (int i = 0; i < stringsArray.length; i++) {
                    try {
                        numbers[i] = Double.parseDouble(stringsArray[i]);
                    } catch (NumberFormatException e) {
                        System.out.printf("Введено некорректное значение %s. Число замениться на 0.\n", stringsArray[i]);
                        numbers[i] = 0;
                    }
                }
                return numbers;
            }
        }
        throw new RuntimeException();
    }
}
