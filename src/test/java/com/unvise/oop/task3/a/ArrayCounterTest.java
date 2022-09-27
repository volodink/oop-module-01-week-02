package com.unvise.oop.task3.a;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayCounterTest {

    @Test
    void countMax() {
        // given
        double[] values1 = {1, 8, 0, 2, 8, 1, 8, 0, 1, 2};
        double[] values2 = {1.13, 8.123, 0.123, 2, 8, 1.13, 8.123, 0, 1, 2, 8};

        // then
        assertAll(
                () -> assertEquals(3, ArrayCounter.countMax(values1)),
                () -> assertEquals(2, ArrayCounter.countMax(values2))
        );
    }
}