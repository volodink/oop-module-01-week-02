package com.unvise.oop.task1.b;

import java.util.InputMismatchException;

public class SimpleCalendar {
    public static int daysInMonth(int year, int mothOrder) throws InputMismatchException {
        if (mothOrder < 1 || mothOrder > 12) {
            throw new InputMismatchException();
        }
        int res = dayInMonth(mothOrder);
        if (isLeapYear(year) && mothOrder == 2) return res + 1;
        return res;
    }

    public static boolean isLeapYear(int year) {
        return !(year % 4 != 0 || (year % 100 == 0 && year % 400 != 0));
    }

    private static int dayInMonth(int mothOrder) {
        return 28
                + (mothOrder + ((int) Math.floor(mothOrder / 8d))) % 2
                + 2 % mothOrder
                + 2 * ((int) Math.floor(1d / mothOrder));
    }
}
