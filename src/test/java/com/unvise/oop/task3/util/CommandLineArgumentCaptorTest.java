package com.unvise.oop.task3.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandLineArgumentCaptorTest {

    @Test
    void numberArray() {
        // given
        String[] exc1 = {"-arr", "[1,2,3,4,6]"};
        String[] exc2 = {"23", "[1,2,3,4,6]"};
        String[] exc3 = {"-arr", "[asdf,2,3,4,6]"};
        String[] exc4 = {"-arr", null};
        String[] exc5 = {null, null};
        String[] exc6 = {};

        // then
        assertAll(
                () -> assertArrayEquals(new double[] {1,2,3,4,6}, CommandLineArgumentCaptor.numberArray(exc1)),
                () -> assertThrows(RuntimeException.class, () -> CommandLineArgumentCaptor.numberArray(exc2)),
                () -> assertArrayEquals(new double[] {0,2,3,4,6}, CommandLineArgumentCaptor.numberArray(exc3)),
                () -> assertThrows(RuntimeException.class, () -> CommandLineArgumentCaptor.numberArray(exc4)),
                () -> assertThrows(RuntimeException.class, () -> CommandLineArgumentCaptor.numberArray(exc5)),
                () -> assertThrows(RuntimeException.class, () -> CommandLineArgumentCaptor.numberArray(exc6))
        );

    }
}