package com.unvise.oop.task3.c;

import com.unvise.oop.task3.b.MergeSort;

public class Median {
    public static double compute(double[] numbers) {
        double[] sorted = MergeSort.sort(numbers, numbers.length);
        if (sorted.length % 2 != 0) {
            return sorted[sorted.length/2];
        }
        return (sorted[sorted.length/2 - 1] + sorted[sorted.length/2]) / 2;
    }
}
