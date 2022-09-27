package com.unvise.oop.task1.b;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.print("Введите год и номер месяца через пробел: ");
        try (Scanner intScanner = new Scanner(System.in)) {
            int year = intScanner.nextInt();
            int monthOrder = intScanner.nextInt();
            System.out.println(SimpleCalendar.daysInMonth(year, monthOrder));
        } catch (InputMismatchException e) {
            System.out.println("Некорректные данные");
            System.exit(1);
        }
    }
}
