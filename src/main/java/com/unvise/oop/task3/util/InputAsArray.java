package com.unvise.oop.task3.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputAsArray {
    public static double[] numbers(Scanner numberScanner) {
        System.out.print("Введите вместимость массива: ");
        int arraySize = 0;
        double[] numbers = new double[0];
        try {
            arraySize = numberScanner.nextInt();
            numbers = new double[arraySize];
        } catch (InputMismatchException | NegativeArraySizeException e) {
            System.out.println("Введено некорректное число для вместимости массива");
            System.exit(1);
        }
        System.out.print("Введите числа через пробел: ");
        for (int i = 0; i < arraySize; i++) {
            try {
                numbers[i] = numberScanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Введено некорректное число. Все значения после некорректного будут заменены на 0");
                numbers[i] = 0;
            }
        }
        return numbers;
    }
}
