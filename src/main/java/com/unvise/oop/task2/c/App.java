package com.unvise.oop.task2.c;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите число n решетки Эратосфена: ");
        try (Scanner intScanner = new Scanner(System.in)) {
            int number = intScanner.nextInt();
            System.out.println(SieveOfEratosthenes.compute(number));
        } catch (InputMismatchException e) {
            System.out.println("Некорректные данные");
            System.exit(1);
        }
    }
}
