package com.unvise.oop.task3.a;

public class ArrayCounter {
    public static int countMax(double[] values) {
        double maxValue = Double.MIN_VALUE;
        for (double value : values) {
            maxValue = Math.max(maxValue, value);
        }

        int maxCount = 0;
        for (double value : values) {
            if (value == maxValue)
                maxCount++;
        }

        return maxCount;
    }
}
