package com.unvise.oop.task2.c;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SieveOfEratosthenesTest {

    @Test
    void compute() {
        // given
        String ex1 = "2 3 5 7 11";
        String ex2 = "2 3 5 7 11 13 17 19";
        String ex3 = "2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89";

        // then
        assertAll(
                () -> assertEquals(ex1, SieveOfEratosthenes.compute(12).trim()),
                () -> assertEquals(ex2, SieveOfEratosthenes.compute(21).trim()),
                () -> assertEquals(ex3, SieveOfEratosthenes.compute(92).trim())
        );
    }
}