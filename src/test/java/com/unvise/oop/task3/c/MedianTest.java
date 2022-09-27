package com.unvise.oop.task3.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianTest {

    @Test
    void compute() {
        // given
        double[] exc1 = {55, 88, 85, 98, 9, 90, 78, 3, 60, 84};
        double[] exc2 = {80, 42, 82, 37, 74, 24, 30, 53, 64, 51};
        // then
        assertAll(
                () -> assertEquals(81, Median.compute(exc1)),
                () -> assertEquals(52, Median.compute(exc2))
        );
    }
}