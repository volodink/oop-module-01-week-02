package com.unvise.oop.task2.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    private static final String PYRAMID_SYMBOL = "#";

    public static void main(String[] args) {
        System.out.print("Введите высоту пирамиды: ");
        try (Scanner intScanner = new Scanner(System.in)) {
            int pyramidHeight = intScanner.nextInt();
            System.out.println(PyramidPrinter.print(PYRAMID_SYMBOL, pyramidHeight));
        } catch (InputMismatchException e) {
            System.out.println("Некорректные данные");
            System.exit(1);
        }
    }
}
