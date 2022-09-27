package com.unvise.oop.task3.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortTest {

    @Test
    void sort() {
        // given
        double[] act1 = {9, 0, -1, 23, 8, 1, 1};
        double[] act2 = {1, 0, 23, 6, -23};
        double[] exp1 = {-1, 0, 1, 1, 8, 9, 23};
        double[] exp2 = {-23, 0, 1, 6, 23};

        // then
        assertAll(
                () -> assertArrayEquals(exp1, MergeSort.sort(act1, act1.length)),
                () -> assertArrayEquals(exp2, MergeSort.sort(act2, act2.length))
        );
    }
}