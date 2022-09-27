package com.unvise.oop.task1.b;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalendarTest {

    @Test
    void daysInMonth() {
        // then
        assertAll(
                () -> assertEquals(30, SimpleCalendar.daysInMonth(0, 9)),
                () -> assertEquals(28, SimpleCalendar.daysInMonth(2022, 2)),
                () -> assertEquals(29, SimpleCalendar.daysInMonth(2024, 2)),
                () -> assertEquals(28, SimpleCalendar.daysInMonth(-13, 2)),
                () -> assertEquals(29, SimpleCalendar.daysInMonth(-12, 2)),
                () -> assertThrows(
                        InputMismatchException.class, () -> SimpleCalendar.daysInMonth(2024, -12))
        );
    }

    @Test
    void isLeapYear() {
        // then
        assertAll(
                () -> assertFalse(SimpleCalendar.isLeapYear(3)),
                () -> assertFalse(SimpleCalendar.isLeapYear(103)),
                () -> assertTrue(SimpleCalendar.isLeapYear(104)),
                () -> assertTrue(SimpleCalendar.isLeapYear(400))
        );
    }
}