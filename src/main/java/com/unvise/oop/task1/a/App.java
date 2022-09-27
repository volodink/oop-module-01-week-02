package com.unvise.oop.task1.a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите возраст: ");
        try (Scanner intScanner = new Scanner(System.in)) {
            int age = intScanner.nextInt();
            System.out.println(age + " " + AgeSuffix.suffix(age));
        } catch (InputMismatchException e) {
            System.out.println("Некорректный возраст");
            System.exit(1);
        }
    }
}
