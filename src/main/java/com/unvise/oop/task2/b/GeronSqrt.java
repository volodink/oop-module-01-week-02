package com.unvise.oop.task2.b;

public class GeronSqrt {
    private static final int ITERATION_LIMIT = 1_000_000;

    public static double sqrt(double number) {
        if (number < 0) return Double.NEGATIVE_INFINITY;

        double res = number;
        double i = 0;
        while ((res * res) > number && i <= ITERATION_LIMIT) {
            res = 0.5 * (res + number / res);
            i++;
        }
        return res;
    }
}
