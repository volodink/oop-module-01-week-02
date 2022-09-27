package com.unvise.oop.task2.b;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class GeronSqrtTest {

    @Test
    void sqrt() {
        // given
        double delta = 0.0001;

        // then
        assertAll(
                () -> assertEquals(5d, GeronSqrt.sqrt(25), delta),
                () -> assertEquals(2.4495, GeronSqrt.sqrt(6), delta),
                () -> assertEquals(11.0905, GeronSqrt.sqrt(123), delta),
                () -> assertEquals(0, GeronSqrt.sqrt(0), delta),
                () -> assertEquals(0, GeronSqrt.sqrt(0), delta),
                () -> assertEquals(Double.NEGATIVE_INFINITY, GeronSqrt.sqrt(-1), delta)
        );
    }
}