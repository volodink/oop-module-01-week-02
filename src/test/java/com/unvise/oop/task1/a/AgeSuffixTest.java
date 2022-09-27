package com.unvise.oop.task1.a;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class AgeSuffixTest {

    @Test
    void suffix() {
        // given
        String form1 = "год";
        String form2 = "года";
        String form3 = "лет";

        // then
        assertAll(
                () -> assertEquals(form1, AgeSuffix.suffix(1)),
                () -> assertEquals(form1, AgeSuffix.suffix(21)),
                () -> assertEquals(form2, AgeSuffix.suffix(22)),
                () -> assertEquals(form2, AgeSuffix.suffix(202)),
                () -> assertEquals(form2, AgeSuffix.suffix(4)),
                () -> assertEquals(form3, AgeSuffix.suffix(5)),
                () -> assertEquals(form3, AgeSuffix.suffix(13)),
                () -> assertEquals(form3, AgeSuffix.suffix(200)),
                () -> assertThrows(InputMismatchException.class, () -> AgeSuffix.suffix(-2)),
                () -> assertThrows(InputMismatchException.class, () -> AgeSuffix.suffix(-14))
        );

    }
}