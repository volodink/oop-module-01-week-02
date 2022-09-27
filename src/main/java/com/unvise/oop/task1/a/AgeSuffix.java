package com.unvise.oop.task1.a;

import java.util.InputMismatchException;

public class AgeSuffix {
    public static String suffix(int age) throws InputMismatchException {
        if (age < 0) {
            throw new InputMismatchException();
        } else if (age % 10 == 1) {
            return "год";
        } else if ((age < 9 || age > 20) && age % 10 < 5 && age % 10 != 0) {
            return "года";
        }
        return "лет";
    }
}
