package com.unvise.oop.task2.b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        try (Scanner doubleScanner = new Scanner(System.in)) {
            double number = doubleScanner.nextDouble();
            System.out.println("Квадратный корень " + number + " = " + GeronSqrt.sqrt(number));
        } catch (InputMismatchException e) {
            System.out.println("Некорректные данные");
            System.exit(1);
        }
    }
}
